package com.example.project4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter {
    public SongAdapter(Activity context, ArrayList<SongsClass> Word) {

        super(context, 0, Word);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songs_list, parent, false);
        }

        SongsClass currentWord = (SongsClass) getItem(position);
        TextView Miwook = (TextView) listItemView.findViewById(R.id.Song_Titel);
        Miwook.setText(currentWord.getSongName());
        TextView defualt = (TextView) listItemView.findViewById(R.id.Artist_Name);
        defualt.setText(currentWord.getAtristsName());
        //return super.getView(position, convertView, parent);
        return listItemView;
    }


}
