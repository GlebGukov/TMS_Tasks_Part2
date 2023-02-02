package com.tms.jockey.horses.horseImpl.healthImpl;

import com.tms.jockey.SpeedFormula;
import com.tms.jockey.horses.horseInterface.HorseHealth;
import com.tms.jockey.horses.myEnum.Temperament;
import org.springframework.stereotype.Component;

@Component
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
