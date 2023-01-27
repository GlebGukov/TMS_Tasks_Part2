package com.tms.horses.horseImpl.healthImpl;

import com.tms.SpeedFormula;
import com.tms.horses.horseInterface.HorseAbility;
import com.tms.myEnum.Temperament;
import lombok.ToString;

@ToString
public class HealthyHorse implements HorseAbility {
    private final SpeedFormula formula = new SpeedFormula();

    @Override
    public double runningSpeed(Temperament temperament) {
        double indexHealth = (Math.random() * (10 - 9) + 9);
        int maxSpeed = 40;
        int minSpeed = 20;
        return formula.speedFormula(temperament,indexHealth, maxSpeed, minSpeed);
    }
}
