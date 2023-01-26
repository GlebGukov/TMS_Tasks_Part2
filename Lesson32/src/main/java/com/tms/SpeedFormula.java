package com.tms;

import com.tms.myEnum.Temperament;

public class SpeedFormula {
    public double speedFormula(Temperament temperament, double indexHealth, int maxSpeed, int minSpeed) {
        double cfAggression = temperament.getCfAggression();
        double cfPatience = temperament.getCfPatience();
        double cfStability = temperament.getCfStability();
        double totalIndex = cfStability + cfAggression + cfPatience;
        return (totalIndex + (Math.random()*(maxSpeed - minSpeed)+ minSpeed))+indexHealth;
    }
}
