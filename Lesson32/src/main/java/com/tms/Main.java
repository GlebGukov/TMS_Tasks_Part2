package com.tms;

import com.tms.horseRacing.HorseRacing;
import com.tms.horseRacing.impl.EuropeCompetitionsHorseRacingImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.tms.config");
        HorseRacing europeCompetitions = context.getBean(EuropeCompetitionsHorseRacingImpl.class);
        europeCompetitions.startCompetitions();
    }
}
