package com.example.project4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_listview);

        /// array list contain song name + Artist name ///

        ArrayList<SongsClass> Songs = new ArrayList<SongsClass>();

        Songs.add(new SongsClass("El fatiha ","Mashary el afasy"));
        Songs.add(new SongsClass("El Baqra ","Mashary el afasy"));
        Songs.add(new SongsClass("Al imraan ","Mashary el afasy"));
        Songs.add(new SongsClass("El anam ","Mashary el afasy"));
        Songs.add(new SongsClass("El akhlas ","Mashary el afasy"));
        Songs.add(new SongsClass("El masad ","Mashary el afasy"));
        Songs.add(new SongsClass("El a3la ","Mashary el afasy"));
        Songs.add(new SongsClass("El ankabot ","Mashary el afasy"));
        Songs.add(new SongsClass("El israa ","Mashary el afasy"));
        Songs.add(new SongsClass("El ae'raf ","Mashary el afasy"));
        Songs.add(new SongsClass("El doha ","Mashary el afasy"));
        Songs.add(new SongsClass("El naas ","Mashary el afasy"));
        Songs.add(new SongsClass("El qar'3a ","Mashary el afasy"));
        Songs.add(new SongsClass("el Qalam ","Mashary el afasy"));
        Songs.add(new SongsClass("El Rahman ","Mashary el afasy"));
        Songs.add(new SongsClass("El insaan ","Mashary el afasy"));
        Songs.add(new SongsClass("El anfal ","Mashary el afasy"));
        Songs.add(new SongsClass("El twaba ","Mashary el afasy"));
        Songs.add(new SongsClass("El Najm ","Mashary el afasy"));
        Songs.add(new SongsClass("El saffat ","Mashary el afasy"));
        Songs.add(new SongsClass("saad ","Mashary el afasy"));
        Songs.add(new SongsClass("Qaf","Mashary el afasy"));
        Songs.add(new SongsClass("el Lail","Mashary el afasy"));
        Songs.add(new SongsClass("El fajar ","Mashary el afasy"));
        Songs.add(new SongsClass("El kahaf ","Mashary el afasy"));
        Songs.add(new SongsClass("El haj ","Mashary el afasy"));
        Songs.add(new SongsClass("El hajer ","Mashary el afasy"));
        Songs.add(new SongsClass("El ma'3da ","Mashary el afasy"));
        Songs.add(new SongsClass("El Nahal ","Mashary el afasy"));
        Songs.add(new SongsClass("El nml ","Mashary el afasy"));

        /// coustem song adaptor///
        SongAdapter adapter = new SongAdapter(this, Songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);



    }
}
