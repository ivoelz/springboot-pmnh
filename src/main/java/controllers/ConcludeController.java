package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/conclude")
public class ConcludeController {

    @RequestMapping("/step3")
    public String showStepThree() {
        return "pages/conclude-step3";
    }
}
