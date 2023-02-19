package com.tms.dto.jockey.horse.implHealth;

import com.tms.dto.jockey.horse.HealthHorse;
import com.tms.dto.jockey.horse.Temperaments;
import lombok.Data;

@Data
public class HealthyHorseImpl implements HealthHorse {
    private final int maxSpeed = 40;
    private final int minSpeed = 20;
    private final double indexHealth = (Math.random() * (10 - 9) + 9);

    @Override
    public double efficiency(Temperaments temperaments) {
        double cfAggression = temperaments.getCfAggression();
        double cfPatience = temperaments.getCfPatience();
        double cfStability = temperaments.getCfStability();
        double totalIndex = cfStability + cfAggression + cfPatience;
        return (totalIndex + (Math.random() * (getMaxSpeed() - getMinSpeed()) + getMinSpeed())) + getIndexHealth();
    }
}
