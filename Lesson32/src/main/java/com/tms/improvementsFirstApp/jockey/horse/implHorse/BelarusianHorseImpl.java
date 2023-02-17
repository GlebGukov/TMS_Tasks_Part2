package com.tms.improvementsFirstApp.jockey.horse.implHorse;

import com.tms.improvementsFirstApp.jockey.horse.HealthHorse;
import com.tms.improvementsFirstApp.jockey.horse.Horse;
import com.tms.improvementsFirstApp.jockey.horse.Temperaments;
import com.tms.improvementsFirstApp.jockey.horse.implHealth.HealthyHorseImpl;
import lombok.Data;

@Data
public class BelarusianHorseImpl implements Horse {
    private final Temperaments melancholic = Temperaments.Melancholic;
    private final HealthHorse healthHorse = new HealthyHorseImpl();
    @Override
    public double runningSpeed() {
        return getHealthHorse().efficiency(getMelancholic());

    }
}
