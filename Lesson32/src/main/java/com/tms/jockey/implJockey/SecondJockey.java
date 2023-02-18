package com.tms.jockey.implJockey;


import com.tms.jockey.Jockey;
import com.tms.jockey.horse.Horse;
import com.tms.jockey.horse.implHorse.BelarusianHorseImpl;
import com.tms.jockey.rider.Rider;
import com.tms.jockey.rider.implRider.BelarusianRiderImpl;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Component;

@Data
@Component(value = "SecondJockey")
@RequiredArgsConstructor
@Value
public class SecondJockey implements Jockey {
    Horse horse = new BelarusianHorseImpl();
    Rider rider = new BelarusianRiderImpl();

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
