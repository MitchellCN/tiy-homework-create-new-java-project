package com.takehomeproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cmitchell on 4/11/17.
 */

@Controller
public class chrisController {


    @RequestMapping("/dino")

    public String battle(Model model){

        model.addAttribute("meat");

        return "chris";
    }





}
