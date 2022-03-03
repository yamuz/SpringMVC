package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goHome(){
        System.out.println("/home/index.jsp.........");
        return "index";
    }

    @GetMapping("/")
    public String goInitial(){
        System.out.println("index.jsp.........");
        return "initial_index";
    }
}
