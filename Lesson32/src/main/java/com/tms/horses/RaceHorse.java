package com.tms.horses;

import com.tms.horses.horseInterface.HorseAbility;
import com.tms.myEnum.Temperament;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public abstract class RaceHorse {

    private int age;
    private Temperament temperament;
    private HorseAbility horseAbility;
    public double runningSpeed(){
        return horseAbility.runningSpeed(getTemperament(),getAge());
    }

}