package com.tms.myInterface.horseImpl.raceHorseImpl;

import com.tms.horses.RaceHorse;
import com.tms.horses.horseInterface.HorseHealth;
import com.tms.horses.myEnum.Temperament;

public class Thoroughbreds extends RaceHorse {

    public Thoroughbreds(Temperament temperament, HorseHealth horseAbility) {
        super(temperament, horseAbility);
    }
    @Override
    public String toString() {
        return "Thoroughbreds " +getTemperament();
    }
}
