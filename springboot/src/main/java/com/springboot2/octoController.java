package com.springboot2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cmitchell on 4/12/17.
 */

@Controller
public class octoController {

    @RequestMapping("/")

    public String sea(Model model){
        model.addAttribute("deepsea", "adventure");

        return "index";
    }


}
