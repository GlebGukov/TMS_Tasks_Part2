package com.tms.web;

import com.tms.converter.ConvertHorseStringToObject;
import com.tms.converter.ConvertStringToTrack;
import com.tms.dto.Horse;
import com.tms.dto.Jockey;
import com.tms.dto.Rider;
import com.tms.dto.TypeOfTrack;
import com.tms.dto.horseRacing.HorseRacing;
import com.tms.dto.horseRacing.impl.EuropeCompetitionsHorseRacingImpl;
import com.tms.service.ListJockey;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/JockeyController")
public class JockeyController {
    AbstractApplicationContext context = new AnnotationConfigApplicationContext("com.tms.converter");

    private final ListJockey listJockey;

    public JockeyController(ListJockey listJockey) {
        this.listJockey = listJockey;
    }

    @GetMapping
    public ModelAndView show() {
        return new ModelAndView("CreateJockey");
    }

    @PostMapping
    public ModelAndView create(String typeHorse, String number) {
        ConvertHorseStringToObject convert = context.getBean(ConvertHorseStringToObject.class);
//        ConvertHorseStringToObject convert = new ConvertHorseStringToObject();
        int num = Integer.parseInt(number);
        Horse horse = convert.convertString(typeHorse);
        Jockey jockey = new Jockey(horse, new Rider(num));
        listJockey.save(jockey);
        Map<String, Object> map = new HashMap<>();
        map.put("all", listJockey.getAll());
        return new ModelAndView("CreateJockey", map);
    }

    @GetMapping("/all")
    public ModelAndView all() {
        Map<String, Object> map = new HashMap<>();
        map.put("all", listJockey.getAll());
        return new ModelAndView("AllJockeys", map);
    }

    @PostMapping("/competitions")
    public ModelAndView competitions(String typeOfTrack, String money) {
        ConvertStringToTrack convert = context.getBean(ConvertStringToTrack.class);
        HorseRacing horseRacing = context.getBean(EuropeCompetitionsHorseRacingImpl.class);
        TypeOfTrack track = convert.convertString(typeOfTrack);
        int money1 = Integer.parseInt(money);
        horseRacing.startCompetitions(listJockey, track, money1);
        Map<String, Object> map = new HashMap<>();
        map.put("comp", horseRacing.startCompetitions(listJockey, track, money1));
        return new ModelAndView("Competition", map);

    }
}
