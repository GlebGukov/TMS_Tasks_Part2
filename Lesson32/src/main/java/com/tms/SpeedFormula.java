package com.tms;

import com.tms.myEnum.Temperament;

public class SpeedFormula {
    public double speedFormula(Temperament temperamentHorse, double indexHealth, int maxSpeed, int minSpeed) {
        double cfAggression = temperamentHorse.getCfAggression();
        double cfPatience = temperamentHorse.getCfPatience();
        double cfStability = temperamentHorse.getCfStability();
        double totalIndex = cfStability + cfAggression + cfPatience;
        return (totalIndex + (Math.random()*(maxSpeed - minSpeed)+ minSpeed))+indexHealth;
    }
}
