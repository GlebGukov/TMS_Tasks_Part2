package com.tms.horses.horseImpl.healthImpl;

import com.tms.SpeedFormula;
import com.tms.horses.horseInterface.HorseAbility;
import com.tms.myEnum.Temperament;

public class SickHorse implements HorseAbility {
    SpeedFormula formula = new SpeedFormula();
    @Override
    public double runningSpeed(Temperament temperament, int age) {
        double indexHealth = (Math.random() * (10 - 9) + 4);
        int maxSpeed = 35;
        int minSpeed = 15;
        return formula.speedFormula(temperament, indexHealth, maxSpeed, minSpeed);
    }
}
