package com.tms.horseRacing.impl;

import com.tms.horseRacing.CompetitorsHandler;
import com.tms.horseRacing.HorseRacing;
import com.tms.jockey.Jockey;
import com.tms.track.TypeOfTrack;
import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
@Data
public class EuropeCompetitionsHorseRacingImpl implements HorseRacing {
    TypeOfTrack track = TypeOfTrack.DefaultTrack;
    CompetitorsHandler europeCompetitors = new ListOfEuropeanRaceParticipants();
    @Setter
    int cash = 500;

    public EuropeCompetitionsHorseRacingImpl() {
    }

    @Autowired
    public EuropeCompetitionsHorseRacingImpl(TypeOfTrack track, CompetitorsHandler handler) {
        this.track = track;
        this.europeCompetitors = handler;
    }


    @Override
    public void startCompetitions() {
        while (cash > 0) {
            double winTime = track.getDistance();
            String winPair = null;
            double passingResult;
            double timeHorseRacing = 0;
            for (Jockey jockey : europeCompetitors.getCompetitors()) {
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
            int balance = oneXBet(winPair, cash, europeCompetitors);
            System.out.print("Pair number " + winPair + " won the race against time: " +
                    String.format("%.2f", winTime));
            System.out.println();
            cash = balance;
            System.out.println("Race time =" + timeHorseRacing);

        }
    }

    private int oneXBet(String winPair, int cash, CompetitorsHandler competitors) {
        List<Integer> registrationNumberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Participating in the races:");
        System.out.println(competitors.getCompetitors());
        System.out.println("You balance: " + cash);
        System.out.println("Which jockey number would you like to bet on?");
        competitors.getCompetitors().forEach(Jockey::number);
        for (Jockey jockey : competitors.getCompetitors()) {
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
