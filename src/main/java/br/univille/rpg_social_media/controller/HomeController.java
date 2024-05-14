package br.univille.rpg_social_media.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public ModelAndView index(){
        return new ModelAndView("home/index");
    }

    @GetMapping("/createficha")
    public ModelAndView createficha(){
        return new ModelAndView("home/createficha");
    }

    @GetMapping("/fichas")
    public ModelAndView fichas(){
        return new ModelAndView("home/fichas");
    }

    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("home/login");
    }
}