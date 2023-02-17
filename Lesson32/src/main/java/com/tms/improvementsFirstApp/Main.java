package com.tms.improvementsFirstApp;

import com.tms.improvementsFirstApp.horseRacing.CompetitorsService;
import com.tms.improvementsFirstApp.horseRacing.HorseRacing;
import com.tms.improvementsFirstApp.horseRacing.impl.EuropeCompetitionsHorseRacingImpl;
import com.tms.improvementsFirstApp.horseRacing.impl.ListOfEuropeanRaceParticipants;
import com.tms.improvementsFirstApp.jockey.Jockey;
import com.tms.improvementsFirstApp.jockey.implJockey.FirstJockeyImpl;
import com.tms.improvementsFirstApp.jockey.implJockey.FourthJockeyImpl;
import com.tms.improvementsFirstApp.jockey.implJockey.SecondJockeyImpl;
import com.tms.improvementsFirstApp.jockey.implJockey.ThirdJockeyImpl;
import com.tms.improvementsFirstApp.jockey.rider.implRider.AmericanRiderImpl;
import com.tms.improvementsFirstApp.track.TypeOfTrack;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Jockey firstJockey = new FirstJockeyImpl();
        Jockey secondJockey = new SecondJockeyImpl();
        Jockey thirdJockey = new ThirdJockeyImpl();
        Jockey fourthJockey = new FourthJockeyImpl();
        CompetitorsService service = new ListOfEuropeanRaceParticipants();
        service.saveCompetitors(firstJockey,secondJockey,thirdJockey,fourthJockey);
        HorseRacing horseRacing = new EuropeCompetitionsHorseRacingImpl();
        horseRacing.startCompetitions(TypeOfTrack.DefaultTrack,service,500);

    }
}
