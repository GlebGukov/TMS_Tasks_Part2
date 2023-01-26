package com.tms.myInterface.horseImpl.raceHorseImpl;

import com.tms.horses.RaceHorse;
import com.tms.horses.horseInterface.HorseAbility;
import com.tms.myEnum.Temperament;

public class Trotter extends RaceHorse {


    public Trotter(int age, Temperament temperament, HorseAbility horseAbility) {
        super(age, temperament, horseAbility);
    }
}
