package com.tms.converter;

import com.tms.dto.Horse;
import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ConvertHorseStringToObject implements ConvertStringToObject<Horse> {
    ConvertHorseStringToObject ConvertHorseStringToObject;
    @Override
    public Horse convertString(String string) {
        return Arrays.stream(Horse.values()).filter(horse -> horse.name().equals(string)).findAny().orElse(Horse.Arabian);
    }
}
