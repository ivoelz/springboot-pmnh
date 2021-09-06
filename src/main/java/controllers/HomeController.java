package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/forward-me")
    public String doForward() {
        return "forward:/conclude/step3";
    }

    @RequestMapping("/redirect-me")
    public String doRedirect() {
        return "redirect:/prepare/step1";
    }

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }
}
