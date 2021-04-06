package com.pytechcoding.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Locale;

@Controller
public class mainController {
    static ArrayList<Album> albums = new ArrayList<>();
    static{
        albums.add(
                new Album("Donde Estan los Ladrones","Shakira","https://www.rollingstone" +
                        ".com/wp-content/uploads/2020/09/R1344-496-Shakira-Donde-Estan-los-Ladrones" +
                        ".jpg?w=1000",12,195) );
        albums.add(
                new Album("Continuum","John mayer","https://www.rollingstone" +
                        ".com/wp-content/uploads/2020/09/R1344-486-john-mayer-continuum-x.jpg?w=1000" ,14
                        ,155));
        albums.add(new Album("RCA","Sza","https://www.rollingstone" +
                ".com/wp-content/uploads/2020/09/R1344-472-SZA-Ctrl.jpg?w=1000",15,255));
    }
    @GetMapping("/")
    public String showSplashPage(){
        return "splash.html";
    }

    @GetMapping("/hello")
    public String showHelloPage(){
        return "hello.html";
    }

    @GetMapping("/capitalize/{phrase}")
    public String showCapitalizePage(Model m,@PathVariable String phrase){
        System.out.println("phrase = " + phrase.toUpperCase(Locale.ROOT));
        m.addAttribute("phrase",phrase.toUpperCase(Locale.ROOT));
        return "capitalize-me.html";
    }

    @GetMapping("/albums")
    public String displayAlbumPage(Model m){
//        ArrayList<Album> albums = new ArrayList<>();

        m.addAttribute("coolAlbums",albums);
        return "music.html";
    }

}
