package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/steam")
public class SteamController {
    @RequestMapping("/step2")
    public String showStepTwo() {
        return "pages/steam-step2";
    }
}
