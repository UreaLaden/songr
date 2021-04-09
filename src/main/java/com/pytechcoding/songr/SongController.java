package com.pytechcoding.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/song/{id}")
    public String displaySongPage(Model m, @PathVariable long id ){
        Album album = albumRepository.getOne(id);
        m.addAttribute("coolAlbums",album);
        return "display-song.html";
    }
    @PostMapping("/song/{id}")
    public RedirectView addSong(@PathVariable long id, int length, int trackNumber,
                                String songTitle){
        System.out.println("songTitle = " + songTitle);
        Album album = albumRepository.getOne(id);
        Song song = new Song(length,trackNumber,album,songTitle);
        songRepository.save(song);
        return new RedirectView("/song/{id}");
    }

    @DeleteMapping("/song/{id}/{albumID}")
    public RedirectView deleteSong(@PathVariable long id, @PathVariable("albumID")long albumID ){
        songRepository.deleteById(id);
        return new RedirectView("/song/{albumID}");
    }
}
