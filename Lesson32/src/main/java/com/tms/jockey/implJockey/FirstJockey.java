package com.tms.jockey.implJockey;

import com.tms.jockey.Jockey;
import com.tms.jockey.horse.Horse;
import com.tms.jockey.horse.implHorse.ArabianHorseImpl;
import com.tms.jockey.rider.Rider;
import com.tms.jockey.rider.implRider.AmericanRiderImpl;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Component;

@Data
@Value
@RequiredArgsConstructor
@Component(value = "FirstJockey")
public class FirstJockey implements Jockey {
    Horse horse = new ArabianHorseImpl();
    Rider rider = new AmericanRiderImpl();

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
