package com.tms.dto.jockey.horse.implHorse;

import com.tms.dto.jockey.horse.HealthHorse;
import com.tms.dto.jockey.horse.Horse;
import com.tms.dto.jockey.horse.implHealth.HealthyHorseImpl;
import com.tms.dto.jockey.horse.Temperaments;
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
