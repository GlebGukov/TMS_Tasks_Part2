package com.tms;

import com.tms.horses.RaceHorse;
import com.tms.horses.horseInterface.HorseAbility;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@ToString
public class Jockey {
    private final RaceHorse raceHorse;
    private final Rider rider;

    double pairCf(){
        return raceHorse.runningSpeed()+ rider.getHorseRacingExperience();
    }
}

