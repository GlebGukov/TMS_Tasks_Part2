package com.tms.horses.horseImpl.raceHorseImpl;

import com.tms.horses.RaceHorse;
import com.tms.horses.horseInterface.HorseHealth;
import com.tms.horses.myEnum.Temperament;

public class Belarusian extends RaceHorse {

    public Belarusian(Temperament temperament, HorseHealth horseAbility) {
        super(temperament, horseAbility);
    }

    @Override
    public String toString() {
        return "Belarusian " +getTemperament();
    }
}
