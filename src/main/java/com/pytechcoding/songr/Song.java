package com.pytechcoding.songr;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    long id;
    int length;
    int trackNumber;

    @ManyToOne
    Album albumTitle;

    public Song(){}

    public Song(int length, int trackNumber, Album albumTitle) {
        this.length = length;
        this.trackNumber = trackNumber;
        this.albumTitle = albumTitle;
    }

    public int getLength() {
        return length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

   
}
