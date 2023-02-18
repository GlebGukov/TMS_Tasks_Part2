package com.tms.jockey.implJockey;

import com.tms.jockey.Jockey;
import com.tms.jockey.horse.Horse;
import com.tms.jockey.horse.implHorse.ThoroughbredsHorseImpl;
import com.tms.jockey.rider.Rider;
import com.tms.jockey.rider.implRider.RussianRiderImpl;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Component;

@Data
@Component(value = "FourthJockey")
@RequiredArgsConstructor
@Value
public class FourthJockey implements Jockey {
    Horse horse = new ThoroughbredsHorseImpl();
    Rider rider = new RussianRiderImpl();

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
