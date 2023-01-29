package com.tms;

import com.tms.horses.RaceHorse;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
public class Jockey {
    private final RaceHorse raceHorse;
    private final Rider rider;
    double pairCf(){
        return raceHorse.runningSpeed()+ rider.getHorseRacingExperience();
    }

    @Override
    public String toString() {
        return "Jockey registration number "+rider.getRegistrationNumber()+" horse: "+ raceHorse.toString();
    }
}

