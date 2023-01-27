package com.tms.myInterface.horseImpl.raceHorseImpl;

import com.tms.Rider;
import com.tms.horses.RaceHorse;
import com.tms.horses.horseInterface.HorseAbility;
import com.tms.myEnum.Temperament;

public class Thoroughbreds extends RaceHorse {

    public Thoroughbreds(Temperament temperament, HorseAbility horseAbility) {
        super(temperament, horseAbility);
    }
}
