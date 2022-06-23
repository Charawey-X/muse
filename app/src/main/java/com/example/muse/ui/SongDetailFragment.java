package com.example.muse.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.muse.R;
import com.example.muse.models.FeaturedArtist;
import com.example.muse.models.Hit;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SongDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SongDetailFragment extends Fragment {

    @BindView(R.id.restaurantImageView)
    ImageView mImageLabel;
    @BindView(R.id.restaurantNameTextView) TextView mNameLabel;
    @BindView(R.id.cuisineTextView)
    TextView mCategoriesLabel;
    @BindView(R.id.ratingTextView) TextView mRatingLabel;
    @BindView(R.id.websiteTextView) TextView mWebsiteLabel;
    @BindView(R.id.phoneTextView) TextView mPhoneLabel;
    @BindView(R.id.addressTextView) TextView mAddressLabel;
    @BindView(R.id.saveRestaurantButton) TextView mSaveRestaurantButton;



    private Hit mSong;

    public SongDetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param song
     * @return A new instance of fragment SongDetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SongDetailFragment newInstance(Hit song) {
        SongDetailFragment fragment = new SongDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable("song", Parcels.wrap(song));
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assert getArguments() != null;
        mSong = Parcels.unwrap(getArguments().getParcelable("song"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_song_detail, container, false);
        ButterKnife.bind(this, view);
        Picasso.get().load(mSong.getResult().getSongArtImageUrl()).into(mImageLabel);

        List<String> categories = new ArrayList<>();

        for (FeaturedArtist artist: mSong.getResult().getFeaturedArtists()) {
            categories.add(artist.getName());
        }

        mNameLabel.setText(mSong.getResult().getTitle());
        mCategoriesLabel.setText(android.text.TextUtils.join(", ", categories));
        mRatingLabel.setText(mSong.getResult().getReleaseDateComponents().getYear());
        mPhoneLabel.setText(mSong.getType());
        mAddressLabel.setText(mSong.getResult().getFeaturedArtists().toString());

        return view;
    }
}