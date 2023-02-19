package com.tms.dto.jockey.implJockey;

import com.tms.dto.jockey.Jockey;
import com.tms.dto.jockey.horse.Horse;
import com.tms.dto.jockey.horse.implHorse.TrotterHorseImpl;
import com.tms.dto.jockey.rider.Rider;
import com.tms.dto.jockey.rider.implRider.ItalianRiderImpl;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Component;

@Data
@Component(value = "ThirdJockey")
@RequiredArgsConstructor
@Value
public class ThirdJockey implements Jockey {
    Horse horse = new TrotterHorseImpl();
    Rider rider = new ItalianRiderImpl();

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
