package com.tms.horses;

import com.tms.horses.horseInterface.HorseHealth;
import com.tms.horses.myEnum.Temperament;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public abstract class RaceHorse {

    private Temperament temperament;
    private HorseHealth horseHealth;
    public double runningSpeed(){
        return horseHealth.runningSpeed(getTemperament());
    }

}