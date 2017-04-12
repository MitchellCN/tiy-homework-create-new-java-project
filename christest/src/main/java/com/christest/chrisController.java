package com.christest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * Created by cmitchell on 4/11/17.
 */

@Controller
public class chrisController {



    @RequestMapping("/hello")

    public String tingle(Model model){

        model.addAttribute("time", LocalDateTime.now());
        Random rand = new Random();
        model.addAttribute("done", rand.nextInt());
        return "chris";
    }
}