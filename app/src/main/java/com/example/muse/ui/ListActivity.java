package com.example.muse.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
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
    @BindView(R.id.listView) ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        String artist = intent.getStringExtra("artist");
        songTextView.setText(getString(R.string.songs_with_the_title,artist));

        GeniusApi client = GeniusClient.getClient();
        Call<SearchResponse> call = client.getResults("RapidAPI-Playground",Constants.GENIUS_API_KEY,"genius.p.rapidapi.com",Constants.GENIUS_API_KEY, artist);

        call.enqueue(new Callback<SearchResponse>() {
            @Override
            public void onResponse(Call<SearchResponse> call, Response<SearchResponse> response) {
                hideProgressBar();
                if(response.isSuccessful()){
                    List<Hit> hitList = response.body().getResponse().getHits();
                    String [] hits = new String[hitList.size()];
                    String [] artists = new String[hitList.size()];

                    for (int i = 0; i < hits.length; i++){
                        hits[i] = hitList.get(i).getResult().getFullTitle();
                    }

                    for (int i = 0; i < artists.length; i++) {
                        PrimaryArtist artist = hitList.get(i).getResult().getPrimaryArtist();
                        artists[i] = artist.getName();
                    }

                    ArrayAdapter adapter = new ListAdapter(ListActivity.this, android.R.layout.simple_list_item_1, hits, artists);
                    mListView.setAdapter(adapter);
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

    private static final String TAG = ListActivity.class.getSimpleName();
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
        mListView.setVisibility(View.VISIBLE);
        songTextView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }
}