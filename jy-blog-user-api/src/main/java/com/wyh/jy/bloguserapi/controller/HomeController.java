package com.wyh.jy.bloguserapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/gohome")
    public String goHome(){
        return "test.html";
    }
}
