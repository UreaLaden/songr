package com.pytechcoding.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Locale;

@Controller
public class mainController {
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

}
