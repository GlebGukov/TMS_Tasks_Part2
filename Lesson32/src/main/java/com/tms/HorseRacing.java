package com.tms;

import lombok.Data;

@Data
public class HorseRacing {
    private Jockey jockey;
    private Track track;


    void StartCompetitions(Track track, Jockey... jockeys) {
        int cfTrack = track.difficulty();
        int distance = track.distance();
        double winTime = 100;
        String winPair = null;
        double passingResult;
        for (Jockey jockey : jockeys) {
            double totalSpeed = jockey.pairCf() / cfTrack;
            passingResult = distance / totalSpeed;
            System.out.println("Пара под номером " + jockey.getRider().getRegistrationNumber() + " пришла к финишу с результатом " + passingResult);
            if (passingResult < winTime) {
                winTime = passingResult;
                winPair = String.valueOf(jockey.getRider().getRegistrationNumber());
            }
        }
        String format = "%.4f";
        System.out.println();
        System.out.print("Пара под номером "+ winPair +" победила со временем: ");
        System.out.printf(format,winTime);
    }

}
