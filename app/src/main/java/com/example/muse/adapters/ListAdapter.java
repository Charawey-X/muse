package com.example.muse.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.muse.R;
import com.example.muse.models.Hit;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.RestaurantViewHolder> {
    private List<Hit> mSongs;
    private Context mContext;

    public ListAdapter(Context context, List<Hit> songs) {
        mContext = context;
        mSongs = songs;
    }

    @Override
    public ListAdapter.RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_list_item, parent, false);
        RestaurantViewHolder viewHolder = new RestaurantViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ListAdapter.RestaurantViewHolder holder, int position) {
        holder.bindSong(mSongs.get(position));
    }

    @Override
    public int getItemCount() {
        return mSongs.size();
    }

    public class RestaurantViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.bookImageView)
        ImageView mRestaurantImageView;
        @BindView(R.id.bookNameTextView)
        TextView mNameTextView;
        @BindView(R.id.categoryTextView) TextView mCategoryTextView;
        @BindView(R.id.publisherTextView) TextView mRatingTextView;
        private Context mContext;

        public RestaurantViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
        }

        public void bindSong(Hit song) {
            Picasso.get().load(song.getResult().getHeaderImageUrl()).into(mRestaurantImageView);
            mNameTextView.setText(song.getResult().getTitle());
            mCategoryTextView.setText(song.getResult().getReleaseDateForDisplay());
            mRatingTextView.setText("Stats: " + song.getResult().getStats());
        }
    }
}
