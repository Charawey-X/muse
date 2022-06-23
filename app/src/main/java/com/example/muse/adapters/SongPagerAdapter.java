package com.example.muse.adapters;

import android.support.annotation.NonNull;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.muse.models.Hit;
import com.example.muse.ui.SongDetailFragment;

import java.util.List;

public class SongPagerAdapter extends FragmentPagerAdapter {
    private List<Hit> mSongs;

    public SongPagerAdapter(@NonNull FragmentManager fm, int behavior, List<Hit> restaurants) {
        super(fm, behavior);
        mSongs = restaurants;
    }

    @Override
    public Fragment getItem(int position) {
        return SongDetailFragment.newInstance(mSongs.get(position));
    }

    @Override
    public int getCount() {
        return mSongs.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mSongs.get(position).getResult().getTitle();
    }
}
