package com.tms.horses.horseImpl.raceHorseImpl;

import com.tms.horses.RaceHorse;
import com.tms.horses.horseInterface.HorseAbility;
import com.tms.myEnum.Temperament;
import com.tms.horses.horseImpl.healthImpl.HealthyHorse;


public class Arabian extends RaceHorse {

    public Arabian(int age, Temperament temperament, HorseAbility horseAbility) {
        super(age, temperament, horseAbility);
    }
}
