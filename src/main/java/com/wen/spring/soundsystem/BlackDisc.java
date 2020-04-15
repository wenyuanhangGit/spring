package com.wen.spring.soundsystem;

import java.util.List;

public class BlackDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for(String track : tracks){
             System.out.println("-Track: " + track);
        }
    }

    public void playTrack(int trackNumber) {
        if ( trackNumber >=0 && trackNumber < tracks.size()) {
            System.out.println(tracks.get(trackNumber));
        }
    }
}