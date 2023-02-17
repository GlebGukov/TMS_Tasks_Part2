package com.tms.improvementsFirstApp.jockey.horse.implHealth;

import com.tms.improvementsFirstApp.jockey.horse.HealthHorse;
import com.tms.improvementsFirstApp.jockey.horse.Temperaments;
import lombok.Data;

@Data
public class StickHorseImpl implements HealthHorse {
    private final int maxSpeed = 35;
    private final int minSpeed = 15;
    private final double indexHealth = (Math.random() * (10 - 9) + 4);

    @Override
    public double efficiency(Temperaments temperaments) {
        double cfAggression = temperaments.getCfAggression();
        double cfPatience = temperaments.getCfPatience();
        double cfStability = temperaments.getCfStability();
        double totalIndex = cfStability + cfAggression + cfPatience;
        return (totalIndex + (Math.random() * (getMaxSpeed() - getMinSpeed()) + getMinSpeed())) + getIndexHealth();
    }
}
