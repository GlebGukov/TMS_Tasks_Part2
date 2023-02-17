package com.tms.improvementsFirstApp.jockey.implJockey;

import com.tms.improvementsFirstApp.jockey.Jockey;
import com.tms.improvementsFirstApp.jockey.horse.Horse;
import com.tms.improvementsFirstApp.jockey.horse.implHorse.ArabianHorseImpl;
import com.tms.improvementsFirstApp.jockey.rider.Rider;
import com.tms.improvementsFirstApp.jockey.rider.implRider.AmericanRiderImpl;
import lombok.Data;

@Data
public class FirstJockeyImpl implements Jockey {
    private final Horse horse = new ArabianHorseImpl();
    private final Rider rider = new AmericanRiderImpl();

    @Override
    public double speed() {
        return getHorse().runningSpeed() + getRider().horseRacingExperience();
    }

    @Override
    public int number() {
        return rider.registrationNumber();
    }

    @Override
    public String toString() {
        return "jockey under registration number " + rider.registrationNumber();
    }
}
