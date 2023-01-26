package com.tms.myInterface.horseImpl.raceHorseImpl;

import com.tms.horses.RaceHorse;
import com.tms.horses.horseInterface.HorseAbility;
import com.tms.myEnum.Temperament;

public class Thoroughbreds extends RaceHorse {

    public Thoroughbreds(int age, Temperament temperament, HorseAbility horseAbility) {
        super(age, temperament, horseAbility);
    }
}
