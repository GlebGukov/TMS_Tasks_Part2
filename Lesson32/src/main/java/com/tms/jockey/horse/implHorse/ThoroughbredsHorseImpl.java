package com.tms.jockey.horse.implHorse;

import com.tms.jockey.horse.HealthHorse;
import com.tms.jockey.horse.Horse;
import com.tms.jockey.horse.Temperaments;
import com.tms.jockey.horse.implHealth.StickHorseImpl;
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
