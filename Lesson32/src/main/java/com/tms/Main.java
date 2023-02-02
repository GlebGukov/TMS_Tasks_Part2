package com.tms;

import com.tms.jockey.Jockey;
import com.tms.track.Track;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("com.tms.config");
        Jockey jockey1 = (Jockey) context.getBean("jockey1");
        Jockey jockey2 = (Jockey) context.getBean("jockey2");
        Jockey jockey3 = (Jockey) context.getBean("jockey3");
        Jockey jockey4 = (Jockey) context.getBean("jockey4");
        Track track = context.getBean(Track.class);
        HorseRacing horseRacing = context.getBean(HorseRacing.class);
        horseRacing.startCompetitions(track,500,jockey1,jockey2,jockey3,jockey4);
    }
}