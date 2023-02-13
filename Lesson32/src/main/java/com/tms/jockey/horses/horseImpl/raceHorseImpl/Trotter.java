package com.tms.jockey.horses.horseImpl.raceHorseImpl;

import com.tms.jockey.horses.RaceHorse;
import com.tms.jockey.horses.horseInterface.HorseHealth;
import com.tms.jockey.horses.myEnum.Temperament;
import org.springframework.stereotype.Component;
public class Trotter extends RaceHorse {
    public Trotter(Temperament temperament, HorseHealth horseAbility) {
        super(temperament, horseAbility);
    }
    @Override
    public String toString() {
        return "Trotter " +getTemperament();
    }
}
