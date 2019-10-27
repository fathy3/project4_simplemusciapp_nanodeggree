package com.example.project4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        ArrayList<SongsClass> Songs = new ArrayList<SongsClass>();


        Songs.add(new SongsClass("MASHARY EL AFASY ","Qura'n el karim"));
        Songs.add(new SongsClass("El dosery  ","Qura'n el karim"));
        Songs.add(new SongsClass("Karim abdo ","Qura'n el karim"));
        Songs.add(new SongsClass("Abd el rahman fathy ","Qura'n el karim"));
        Songs.add(new SongsClass("Mohamed ahmed ","Qura'n el karim"));
        Songs.add(new SongsClass("Fathy mohamed ","Qura'n el karim"));
        Songs.add(new SongsClass("Abd el basat abd el samad ","Qura'n el karim"));
        Songs.add(new SongsClass("Yousef mohamed ","Qura'n el karim"));
        Songs.add(new SongsClass("Tarek ahmed ","Qura'n el karim"));

        /// coustem song adaptor///
        SongAdapter adapter = new SongAdapter(this, Songs);


        ListView listView = (ListView) findViewById(R.id.list2);


        listView.setAdapter(adapter);

    }
}
