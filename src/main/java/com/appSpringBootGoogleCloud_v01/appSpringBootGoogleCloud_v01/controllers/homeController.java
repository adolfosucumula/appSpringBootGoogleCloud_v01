package com.appSpringBootGoogleCloud_v01.appSpringBootGoogleCloud_v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping(name = "/home")
    public String index(){
        return "home/index";
    }
}
