package com.tms.improvementsFirstApp.jockey.horse.implHorse;

import com.tms.improvementsFirstApp.jockey.horse.HealthHorse;
import com.tms.improvementsFirstApp.jockey.horse.Horse;
import com.tms.improvementsFirstApp.jockey.horse.implHealth.HealthyHorseImpl;
import com.tms.improvementsFirstApp.jockey.horse.Temperaments;
import lombok.Data;

@Data
public class ArabianHorseImpl implements Horse {
    private final Temperaments choleric = Temperaments.Choleric;
    private final HealthHorse healthHorse = new HealthyHorseImpl();

    @Override
    public double runningSpeed() {
        return healthHorse.efficiency(getCholeric());
    }
}
