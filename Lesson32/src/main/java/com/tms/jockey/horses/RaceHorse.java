package com.tms.jockey.horses;

import com.tms.jockey.horses.horseInterface.HorseHealth;
import com.tms.jockey.horses.myEnum.Temperament;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@AllArgsConstructor
public abstract class RaceHorse {

    private Temperament temperament;
    private HorseHealth horseHealth;
    public double runningSpeed(){
        return horseHealth.runningSpeed(getTemperament());
    }

}