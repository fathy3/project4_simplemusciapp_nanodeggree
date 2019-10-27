package com.example.project4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /// locate Text view and start intent///

        TextView Artist = (TextView) findViewById(R.id.text1);
        TextView Albume = (TextView) findViewById(R.id.text2);
        TextView MusicLibrary = (TextView) findViewById(R.id.text3);
        /// On click to start intent ///

        Artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startArtistActivity = new Intent(MainActivity.this,ArtistsActivity.class);
                 startActivity(startArtistActivity);
            }
        });

        Albume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startAlbumeActivity = new Intent(MainActivity.this,AlbumsActivity.class);
                startActivity(startAlbumeActivity);
            }
        });


        MusicLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startMusicActivity = new Intent(MainActivity.this,MusicLibraryActivity.class);
                startActivity(startMusicActivity);
            }
        });
    }
}
