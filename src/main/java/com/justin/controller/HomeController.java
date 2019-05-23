package com.justin.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }
}
