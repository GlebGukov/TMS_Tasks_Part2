package com.tms.web;

import com.tms.converter.ConvertHorseStringToObject;
import com.tms.dto.Horse;
import com.tms.dto.Jockey;
import com.tms.dto.Rider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LookController {

    @GetMapping
    public String home() {
        return "Home";
    }
@GetMapping("/competition")
    public String createCompetitions(){
        return "Competition";
    }


}
