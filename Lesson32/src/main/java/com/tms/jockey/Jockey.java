package com.tms.jockey;

import com.tms.jockey.rider.Rider;
import com.tms.jockey.horses.RaceHorse;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@RequiredArgsConstructor
@Service
public class Jockey {
    private final RaceHorse raceHorse;
    private final Rider rider;

    public double pairCf() {
        return raceHorse.runningSpeed() + rider.getHorseRacingExperience();
    }

    @Override
    public String toString() {
        return "Jockey registration number " + rider.getRegistrationNumber() + " horse: " + raceHorse.toString();
    }
}