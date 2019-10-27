package com.example.project4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        ArrayList<SongsClass> Songs = new ArrayList<SongsClass>();


        Songs.add(new SongsClass("Qouran el  krim 2019 ","By mashary el afasy "));
        Songs.add(new SongsClass("Qouran el  krim 2012 ","EL dosery  "));
        Songs.add(new SongsClass("Qouran el  krim 2013 ","Ramdan"));
        Songs.add(new SongsClass("Qouran el  krim 2015 ","Mohamed ahmed"));
        Songs.add(new SongsClass("Qouran el  krim 2016 ","Abd el baset abd el samad"));
        Songs.add(new SongsClass("Qouran el  krim 2017 ","By mashary el afasy 2014 "));
        Songs.add(new SongsClass("Qouran el  krim 2019 ","mohamed abdo"));
        Songs.add(new SongsClass("Qouran el  krim 2011 ","Karim el lithy "));
        Songs.add(new SongsClass("Qouran el  krim 2012 ","ahmed badr "));
        Songs.add(new SongsClass("Qouran el  krim 2013 ","abd el rahman "));
        /// coustem song adaptor///
        SongAdapter adapter = new SongAdapter(this, Songs);


        ListView listView = (ListView) findViewById(R.id.lis3);


        listView.setAdapter(adapter);
    }
}
