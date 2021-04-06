package com.pytechcoding.songr;

public class Album {
    String title;
    String artist;
    String imageUrl;
    int songCount;
    int length;

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
