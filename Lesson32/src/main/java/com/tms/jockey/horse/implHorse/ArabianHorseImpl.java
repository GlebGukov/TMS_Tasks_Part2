package com.tms.jockey.horse.implHorse;

import com.tms.jockey.horse.HealthHorse;
import com.tms.jockey.horse.Horse;
import com.tms.jockey.horse.Temperaments;
import com.tms.jockey.horse.implHealth.HealthyHorseImpl;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ArabianHorseImpl implements Horse {
    private final Temperaments choleric = Temperaments.Choleric;
    private final HealthHorse healthHorse = new HealthyHorseImpl();

    @Override
    public double runningSpeed() {
        return healthHorse.efficiency(getCholeric());
    }
}
