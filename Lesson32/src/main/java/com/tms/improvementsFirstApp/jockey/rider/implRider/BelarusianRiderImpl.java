package com.tms.improvementsFirstApp.jockey.rider.implRider;

import com.tms.improvementsFirstApp.jockey.rider.Rider;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BelarusianRiderImpl implements Rider {

    private final int number = 111;
    private final int experience = 14;

    @Override
    public int registrationNumber() {
        return getNumber();
    }

    @Override
    public int horseRacingExperience() {
        return getExperience();
    }
}
