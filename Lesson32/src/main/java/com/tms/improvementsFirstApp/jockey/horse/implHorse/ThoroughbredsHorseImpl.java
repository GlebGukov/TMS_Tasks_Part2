package com.tms.improvementsFirstApp.jockey.horse.implHorse;

import com.tms.improvementsFirstApp.jockey.horse.HealthHorse;
import com.tms.improvementsFirstApp.jockey.horse.Horse;
import com.tms.improvementsFirstApp.jockey.horse.Temperaments;
import com.tms.improvementsFirstApp.jockey.horse.implHealth.StickHorseImpl;
import lombok.Data;

@Data
public class ThoroughbredsHorseImpl implements Horse {
    private final Temperaments sanguine = Temperaments.Sanguine;
    private final HealthHorse healthHorse = new StickHorseImpl();

    @Override
    public double runningSpeed() {
        return getHealthHorse().efficiency(getSanguine());
    }
}
