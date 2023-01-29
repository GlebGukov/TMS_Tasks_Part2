package com.tms.horses.horseImpl.healthImpl;

import com.tms.SpeedFormula;
import com.tms.horses.horseInterface.HorseHealth;
import com.tms.horses.myEnum.Temperament;

public class SickHorse implements HorseHealth {
    private final SpeedFormula formula = new SpeedFormula();
    @Override
    public double runningSpeed(Temperament temperament) {
        double indexHealth = (Math.random() * (10 - 9) + 4);
        int maxSpeed = 35;
        int minSpeed = 15;
        return formula.speedFormula(temperament,indexHealth, maxSpeed, minSpeed);
    }
}
