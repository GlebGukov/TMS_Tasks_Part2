package com.tms.horses.horseImpl.raceHorseImpl;

import com.tms.horses.RaceHorse;
import com.tms.horses.horseInterface.HorseHealth;
import com.tms.horses.myEnum.Temperament;


public class Arabian extends RaceHorse {

    public Arabian(Temperament temperament, HorseHealth horseAbility) {
        super(temperament, horseAbility);
    }

    @Override
    public String toString() {
        return "Arabian " + getTemperament();
    }
}
