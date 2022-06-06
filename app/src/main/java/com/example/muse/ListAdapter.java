package com.example.muse;

import android.content.Context;
import android.widget.ArrayAdapter;

public class ListAdapter extends ArrayAdapter {
    private final Context mContext;
    private final String[] mSongList;
    private final String[] artists;

    public ListAdapter(Context mContext,int resource, String[] mSongList, String[] artists) {
        super(mContext,resource);
        this.mContext=mContext;
        this.mSongList=mSongList;
        this.artists=artists;
    }

    @Override
    public int getCount() {
        return mSongList.length;
    }

    @Override
    public Object getItem(int position) {
        String song = mSongList[position];
        String artist = artists[position];
        return String.format("%s \nBy %s",song,artist);
    }
}
