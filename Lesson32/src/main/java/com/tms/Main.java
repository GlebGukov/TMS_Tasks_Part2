package com.tms;


import com.tms.myEnum.Temperament;
import com.tms.horses.horseImpl.healthImpl.HealthyHorse;
import com.tms.horses.horseImpl.raceHorseImpl.Arabian;
import com.tms.myInterface.horseImpl.raceHorseImpl.Trotter;

public class Main {
    public static void main(String[] args) {
        Jockey jockey1 = new Jockey(new Arabian(5, Temperament.Choleric,new HealthyHorse()), new Rider(29,13));
        Jockey jockey2 = new Jockey(new Trotter(4,Temperament.Sanguine,new HealthyHorse()),new Rider(2,25));
        HorseRacing horseRacing = new HorseRacing();
        horseRacing.StartCompetitions(new StandardTrackImpl(),jockey1,jockey2);


    }
}