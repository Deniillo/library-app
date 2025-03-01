package itmo.deniill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/authors")
    public String authors() {
        return "authors";
    }

    @GetMapping("/genres")
    public String genres() {
        return "genres";
    }

    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }

    @GetMapping("/whatToRead")
    public String whatToRead() {
        return "whatToRead";
    }
}
