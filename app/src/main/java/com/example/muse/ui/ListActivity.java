package com.example.muse.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.muse.Constants;
import com.example.muse.R;
import com.example.muse.adapters.ListAdapter;
import com.example.muse.models.Hit;
import com.example.muse.models.PrimaryArtist;
import com.example.muse.models.SearchResponse;
import com.example.muse.network.GeniusApi;
import com.example.muse.network.GeniusClient;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListActivity extends AppCompatActivity {
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.songTextView) TextView songTextView;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;
    private ListAdapter mAdapter;
    public List<Hit> songs;

    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;
    private String mRecentAddress;

    private static final String TAG = ListActivity.class.getSimpleName();


    private void fetchSongs(String song) {
        GeniusApi client = GeniusClient.getClient();
        Call<SearchResponse> call = client.getResults("RapidAPI-Playground",Constants.GENIUS_API_KEY,"genius.p.rapidapi.com",Constants.GENIUS_API_KEY, song);

        call.enqueue(new Callback<SearchResponse>() {
            @Override
            public void onResponse(Call<SearchResponse> call, Response<SearchResponse> response) {
                hideProgressBar();
                if(response.isSuccessful()){
                    songs = response.body().getResponse().getHits();
                    mAdapter = new ListAdapter(ListActivity.this, songs);
                    mRecyclerView.setAdapter(mAdapter);
                    RecyclerView.LayoutManager layoutManager =
                            new LinearLayoutManager(ListActivity.this);
                    mRecyclerView.setLayoutManager(layoutManager);
                    mRecyclerView.setHasFixedSize(true);
                    showSongs();
                } else showUnsuccessfulMessage();
            }

            @Override
            public void onFailure(Call<SearchResponse> call, Throwable t) {
                Log.e("Error Message", "onFailure: ",t );
                hideProgressBar();
                showFailureMessage();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String song = intent.getStringExtra("artist");
        //songTextView.setText(getString(R.string.songs_with_the_title,artist));
        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mRecentAddress = mSharedPreferences.getString(Constants.PREFERENCES_SONG_KEY, null);
        if(mRecentAddress != null){
            fetchSongs(mRecentAddress);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);
        ButterKnife.bind(this);

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mSharedPreferences.edit();

        MenuItem menuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String song) {
                addToSharedPreferences(song);
                fetchSongs(song);
                return false;
            }


            @Override
            public boolean onQueryTextChange(String location) {
                return false;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        return super.onOptionsItemSelected(item);
    }


    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @SuppressLint("NonConstantResourceId")
    @BindView(R.id.progressBar) ProgressBar mProgressBar;

    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showSongs() {
        mRecyclerView.setVisibility(View.VISIBLE);
        //songTextView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }

    private void addToSharedPreferences(String location) {
        mEditor.putString(Constants.PREFERENCES_SONG_KEY, location).apply();
    }
}