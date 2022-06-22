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
import com.example.muse.models.Track;
import com.example.muse.models.Track__1;
import com.example.muse.models.TracksResponse;
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
        Call<TracksResponse> call = client.getResults(Constants.API_KEY, artist);

        call.enqueue(new Callback<TracksResponse>() {
            @Override
            public void onResponse(Call<TracksResponse> call, Response<TracksResponse> response) {
                hideProgressBar();
                if(response.isSuccessful()){
                    List<Track> trackList = response.body().getTrackList();
                    String [] hits = new String[trackList.size()];
                    String [] albums = new String[trackList.size()];

                    for (int i = 0; i < hits.length; i++){
                        hits[i] = String.valueOf(trackList.get(i).getTrack());
                    }

                    for (int i = 0; i < albums.length; i++) {
                        Track__1 album = trackList.get(i).getTrack();
                        albums[i] = album.getAlbumName();
                    }

                    ArrayAdapter adapter = new ListAdapter(ListActivity.this, android.R.layout.simple_list_item_1, hits, albums);
                    mListView.setAdapter(adapter);
                    showSongs();
                } else showUnsuccessfulMessage();
            }

            @Override
            public void onFailure(Call<TracksResponse> call, Throwable t) {
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