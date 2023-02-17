package com.tms.improvementsFirstApp.jockey.implJockey;


import com.tms.improvementsFirstApp.jockey.Jockey;
import com.tms.improvementsFirstApp.jockey.horse.Horse;
import com.tms.improvementsFirstApp.jockey.horse.implHorse.BelarusianHorseImpl;
import com.tms.improvementsFirstApp.jockey.rider.Rider;
import com.tms.improvementsFirstApp.jockey.rider.implRider.BelarusianRiderImpl;
import lombok.Data;
import lombok.ToString;

@Data
public class SecondJockeyImpl implements Jockey {
    private final Horse horse = new BelarusianHorseImpl();
    private final Rider rider = new BelarusianRiderImpl();

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
        return "jockey under registration number" + rider.registrationNumber();
    }
}
