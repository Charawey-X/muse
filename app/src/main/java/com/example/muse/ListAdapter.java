package com.example.muse;

import android.content.Context;
import android.widget.ArrayAdapter;

public class ListAdapter extends ArrayAdapter {
    private final Context mContext;
    private final String[] mSongList;

    public ListAdapter(Context mContext,int resource, String[] mSongList) {
        super(mContext,resource);
        this.mContext=mContext;
        this.mSongList=mSongList;
    }

    @Override
    public int getCount() {
        return mSongList.length;
    }

    @Override
    public Object getItem(int position) {

        return mSongList[position];
    }
}
