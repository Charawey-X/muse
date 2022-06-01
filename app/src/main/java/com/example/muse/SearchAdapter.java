package com.example.muse;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SearchAdapter extends BaseAdapter {

    private final Context context;
    private final String[] searchItems;
    private LayoutInflater inflater;

    public SearchAdapter(Context context, String[] searchItems) {
        this.context=context;
        this.searchItems=searchItems;
    }

    @Override
    public int getCount() {
        return searchItems.length;
    }

    @Override
    public Object getItem(int position) {
        return searchItems[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint({"ResourceType", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView==null){
            convertView = inflater.inflate(R.id.searchGrid,null);
        }

        TextView searchTitle = convertView.findViewById(R.id.searchTitle);
        searchTitle.setText(searchItems[position]);
        return convertView;
    }
}
