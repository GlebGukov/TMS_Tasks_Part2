package com.tms.dto.jockey.rider.implRider;

import com.tms.dto.jockey.rider.Rider;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@ToString
@RequiredArgsConstructor
@Component
public class RussianRiderImpl implements Rider {
    private final int number = 999;
    private final int experience = 11;

    @Override
    public int registrationNumber() {
        return getNumber();
    }

    @Override
    public int horseRacingExperience() {
        return getExperience();
    }
}
