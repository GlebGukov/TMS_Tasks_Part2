package com.tms.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class FirstController {

    @GetMapping
    public String home(){
        return "home";
    }

}
