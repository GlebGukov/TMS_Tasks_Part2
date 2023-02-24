package com.tms.converter;

import com.tms.dto.Horse;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Data
@NoArgsConstructor
@Service
public class ConvertHorseStringToObject implements ConvertStringToObject {

    @Override
    public Horse convertString(String string) {
        if (Arrays.stream(Horse.values()).anyMatch(horse1 -> horse1.name().equals(string))) {
            return Horse.valueOf(string);
        }
        return Horse.Arabian;
    }
}
