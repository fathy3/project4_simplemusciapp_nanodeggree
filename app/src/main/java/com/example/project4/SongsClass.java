package com.example.project4;

public class SongsClass {

    private String SongName ;
    private String AtristsName ;


    public SongsClass(String songName, String atristsName) {
        SongName = songName;
        AtristsName = atristsName;
    }

    public String getSongName() {
        return SongName;
    }

    public String getAtristsName() {
        return AtristsName;
    }


}
