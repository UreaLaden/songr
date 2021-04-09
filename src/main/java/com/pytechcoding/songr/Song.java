package com.pytechcoding.songr;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    long id;
    int length;
    int trackNumber;

    String songTitle;

    @ManyToOne
    Album albumTitle;

    public Song(){}

    public Song(int length, int trackNumber, Album albumTitle, String songTitle) {
        this.length = length;
        this.trackNumber = trackNumber;
        this.albumTitle = albumTitle;
        this.songTitle = songTitle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public Album getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(Album albumTitle) {
        this.albumTitle = albumTitle;
    }

    public int getLength() {
        return length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }


}
