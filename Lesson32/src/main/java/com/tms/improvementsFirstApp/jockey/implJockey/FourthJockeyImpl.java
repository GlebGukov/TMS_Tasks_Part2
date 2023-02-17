package com.tms.improvementsFirstApp.jockey.implJockey;

import com.tms.improvementsFirstApp.jockey.Jockey;
import com.tms.improvementsFirstApp.jockey.horse.Horse;
import com.tms.improvementsFirstApp.jockey.horse.implHorse.ThoroughbredsHorseImpl;
import com.tms.improvementsFirstApp.jockey.rider.Rider;
import com.tms.improvementsFirstApp.jockey.rider.implRider.RussianRiderImpl;
import lombok.Data;
import lombok.ToString;

@Data
public class FourthJockeyImpl implements Jockey {
    private final Horse horse = new ThoroughbredsHorseImpl();
    private final Rider rider = new RussianRiderImpl();

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
