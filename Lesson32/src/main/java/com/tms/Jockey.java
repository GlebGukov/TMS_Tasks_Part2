package com.tms;

import com.tms.horses.RaceHorse;
import com.tms.horses.horseInterface.HorseAbility;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Jockey {
    private RaceHorse raceHorse;
    private Rider rider;

    double cfWin(){

        return raceHorse.runningSpeed()+ rider.getHorseRacingExperience();
    }
}
