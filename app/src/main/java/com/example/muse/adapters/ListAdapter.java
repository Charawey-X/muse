package com.example.muse.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.muse.R;
import com.example.muse.models.Hit;
import com.example.muse.ui.SongDetailActivity;
import com.squareup.picasso.Picasso;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.SongViewHolder> {
    private List<Hit> mSongs;
    private Context mContext;

    public ListAdapter(Context context, List<Hit> songs) {
        mContext = context;
        mSongs = songs;
    }

    @Override
    public ListAdapter.SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_list_item, parent, false);
        SongViewHolder viewHolder = new SongViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ListAdapter.SongViewHolder holder, int position) {
        holder.bindSong(mSongs.get(position));
    }

    @Override
    public int getItemCount() {
        return mSongs.size();
    }

    public class SongViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.bookImageView)
        ImageView mRestaurantImageView;
        @BindView(R.id.bookNameTextView)
        TextView mNameTextView;
        @BindView(R.id.categoryTextView) TextView mCategoryTextView;
        @BindView(R.id.publisherTextView) TextView mRatingTextView;
        private Context mContext;

        public SongViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
            itemView.setOnClickListener(this);
        }

        public void bindSong(Hit song) {
            Picasso.get().load(song.getResult().getHeaderImageUrl()).into(mRestaurantImageView);
            mNameTextView.setText(song.getResult().getTitle());
            mCategoryTextView.setText(song.getResult().getPrimaryArtist().getName());
            mRatingTextView.setText(song.getResult().getReleaseDateComponents().getYear().toString());
        }
        @Override
        public void onClick(View v) {
            int itemPosition = getLayoutPosition();
            Intent intent = new Intent(mContext, SongDetailActivity.class);
            intent.putExtra("position", itemPosition);
            intent.putExtra("songs", Parcels.wrap(mSongs));
            mContext.startActivity(intent);
        }
    }
}
