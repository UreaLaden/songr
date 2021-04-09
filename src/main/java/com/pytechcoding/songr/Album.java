package com.pytechcoding.songr;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    public long getId() {
        return id;
    }

    @Column(columnDefinition = "TEXT")
    String title;

    @OneToMany(mappedBy="albumTitle",cascade = CascadeType.ALL)
    public List<Song> songs;

    String artist;
    String imageUrl;
    int songCount;
    int length;


    public Album(){}

    public Album(String title, String artist, String imageUrl,int songCount,int length){
        this.title = title;
        this.artist = artist;
        this.imageUrl = imageUrl;
        this.songCount = songCount;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getLength() {
        return length;
    }
    public List<Song> getSongs() {
        return songs;
    }
}
