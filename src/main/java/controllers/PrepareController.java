package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prepare")
public class PrepareController {
    @RequestMapping("/step1")
    public String showStepOne() {
        return "pages/prepare-step1";
    }
}