package com.tms.jockey.horses.horseImpl.healthImpl;

import com.tms.jockey.horses.horseInterface.HorseHealth;
import com.tms.jockey.horses.myEnum.Temperament;
import org.springframework.stereotype.Component;

@Component
public class SickHorse implements HorseHealth {
    @Override
    public double runningSpeed(Temperament temperament) {
        double indexHealth = (Math.random() * (10 - 9) + 4);
        int maxSpeed = 35;
        int minSpeed = 15;
        return speedFormula(temperament, indexHealth, maxSpeed, minSpeed);
    }

    private double speedFormula(Temperament temperamentHorse, double indexHealth, int maxSpeed, int minSpeed) {
        double cfAggression = temperamentHorse.getCfAggression();
        double cfPatience = temperamentHorse.getCfPatience();
        double cfStability = temperamentHorse.getCfStability();
        double totalIndex = cfStability + cfAggression + cfPatience;
        return (totalIndex + (Math.random() * (maxSpeed - minSpeed) + minSpeed)) + indexHealth;
    }
}
