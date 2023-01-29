package com.tms;

import com.tms.track.Track;
import lombok.Data;

import java.util.*;

@Data
public class HorseRacing {
    private Jockey jockey;
    private Track track;


    void StartCompetitions(Track track, Jockey... jockeys){
        int cash = 500;
        while (cash>0) {
            int cfTrack = track.difficulty();
            int distance = track.distance();
            double winTime = distance;
            String winPair = null;
            double passingResult;
            for (Jockey jockey : jockeys) {
                double totalSpeed = jockey.pairCf() / cfTrack;
                passingResult = distance / totalSpeed;
//                String s = passingResult + " Результат пары под номером " + jockey.getRider().getRegistrationNumber();
                if (passingResult < winTime) {
                    winTime = passingResult;
                    winPair = String.valueOf(jockey.getRider().getRegistrationNumber());
                }
            }
            int balance = oneXBet(winPair, cash, jockeys);
            String format = "%.2f";
            System.out.println();
            System.out.print("Пара под номером " + winPair + " победила со временем: ");
            System.out.printf(format, winTime);
            System.out.println();
            cash = balance;
        }
    }
    private int oneXBet(String winPair,int cash,Jockey... jockeys) {
        List<Integer> registrationNumberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Participating in the races:");
        Arrays.stream(jockeys).forEach(jockey1 -> {
            String string = jockey1.toString();
            System.out.println(string);
        });
        System.out.println("You balance: " + cash);
        System.out.println("Which jockey would you like to bet on?");
        Arrays.stream(jockeys).forEach(jockey1 -> {
            int registrationNumber = jockey1.getRider().getRegistrationNumber();
            registrationNumberList.add(registrationNumber);
        });
        int betNumber = scanner.nextInt();
        while (!registrationNumberList.contains(betNumber)) {
            System.out.println("no such pair exists");
            betNumber = scanner.nextInt();
        }
        System.out.println("how much ?");
        double betCash = scanner.nextInt();
        while (betCash > cash) {
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
