package com.tms.dto.horseRacing.impl;

import com.tms.dto.Jockey;
import com.tms.dto.TypeOfTrack;
import com.tms.dto.horseRacing.HorseRacing;
import com.tms.service.ListJockey;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Data
//@Component
public class EuropeCompetitionsHorseRacingImpl implements HorseRacing {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Starting competitions");
    }

    @PreDestroy
    public void doMyDestr() {
        System.out.println("You Lose");
    }

    @Override
    public String startCompetitions(ListJockey listJockey, TypeOfTrack track, int cash) {
        while (cash > 0) {
            double winTime = track.getDistance();
            String winPair = null;
            double passingResult;
            double timeHorseRacing = 0;
            for (Jockey jockey : listJockey.getJockeyList()) {
                double totalSpeed = jockey.getHorse().run() / track.getDifficulty();
                passingResult = track.getDistance() / totalSpeed;
                timeHorseRacing = passingResult;
                if (passingResult < winTime) {
                    winTime = passingResult;
                    winPair = String.valueOf(jockey.getRider().getRegistrationNumber());
                }
                if (passingResult > winTime) {
                    timeHorseRacing = passingResult;
                }
            }
            int balance = oneXBet(winPair, cash, listJockey);
            System.out.print("Pair number " + winPair + " won the race against time: " +
                    String.format("%.2f", winTime));
            System.out.println();
            cash = balance;
            System.out.println("Race time =" + timeHorseRacing);
            return winPair;

        }
        return "youlose";
    }

    private int oneXBet(String winPair, int cash, ListJockey listJockey) {
        List<Integer> registrationNumberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Participating in the races:");
        System.out.println(listJockey.getJockeyList());
        System.out.println("You balance: " + cash);
        System.out.println("Which jockey number would you like to bet on?");
//        competitors.getCompetitors().forEach(Jockey::number);
        for (Jockey jockey : listJockey.getJockeyList()) {
            registrationNumberList.add(jockey.getRider().getRegistrationNumber());
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
            } else System.out.println();
            return cash -= betCash;
        }
        return cash;
    }
}
