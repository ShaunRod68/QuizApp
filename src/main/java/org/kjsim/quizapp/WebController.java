package org.kjsim.quizapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping({"/","home"})
    public String showHome(){
        return "index";
    }
}
