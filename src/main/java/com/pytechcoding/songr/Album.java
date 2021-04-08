package com.pytechcoding.songr;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    String imageUrl;
    int songCount;
    int length;

    @OneToMany(mappedBy="albumTitle",cascade = CascadeType.ALL)
    List<Song> songs;

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

    public String getImageUrl() {
        return imageUrl;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getLength() {
        return length;
    }
}
