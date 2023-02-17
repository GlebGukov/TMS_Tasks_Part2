package com.tms.improvementsFirstApp.horseRacing.impl;

import com.tms.improvementsFirstApp.horseRacing.CompetitorsService;
import com.tms.improvementsFirstApp.horseRacing.HorseRacing;
import com.tms.improvementsFirstApp.jockey.Jockey;
import com.tms.improvementsFirstApp.track.TypeOfTrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EuropeCompetitionsHorseRacingImpl implements HorseRacing {

    @Override
    public void startCompetitions(TypeOfTrack track,CompetitorsService competitors, int cash) {
        while (cash > 0) {
//            int cfTrack = track.getDifficulty();
//            int distance = track.getDistance();
            double winTime = track.getDistance();
            String winPair = null;
            double passingResult;
            double timeHorseRacing = 0;
            for (Jockey jockey : competitors.getCompetitors()) {
                double totalSpeed = jockey.speed() / track.getDifficulty();
                passingResult = track.getDistance() / totalSpeed;
                timeHorseRacing = passingResult;
                if (passingResult < winTime) {
                    winTime = passingResult;
                    winPair = String.valueOf(jockey.number());
                }
                if (passingResult > winTime) {
                    timeHorseRacing = passingResult;
                }
            }
            int balance = oneXBet(winPair, cash,competitors);
            System.out.print("Pair number " + winPair + " won the race against time: " +
                    String.format("%.2f", winTime));
            System.out.println();
            cash = balance;
            System.out.println("Race time =" + timeHorseRacing);

        }
    }
    private int oneXBet (String winPair, int cash,CompetitorsService competitors) {
        List<Integer> registrationNumberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Participating in the races:");
        System.out.println(competitors.getCompetitors());
        System.out.println("You balance: " + cash);
        System.out.println("Which jockey number would you like to bet on?");
        competitors.getCompetitors().forEach(Jockey::number);
        for (Jockey jockey:competitors.getCompetitors()){
            registrationNumberList.add(jockey.number());
        }
        int betNumber = scanner.nextInt();
        while (!registrationNumberList.contains(betNumber)) {
            System.out.println("no such pair exists");
            betNumber = scanner.nextInt();
        }
        System.out.println("how much ?");
        double betCash = scanner.nextInt();
        while (betCash > cash || betCash < 0) {
            System.out.println("no money on balance");
            betCash = scanner.nextInt();
        }
        if (registrationNumberList.contains(betNumber)) {
            if (betNumber == Integer.parseInt(winPair)) {
                System.out.println("You win");
                return cash += betCash * 2;
            } else System.out.println("you lose");
            return cash -= betCash;
        }
        return cash;
    }
}
