package com.tms.converter;

import com.tms.dto.TypeOfTrack;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ConvertStringToTrack implements ConvertStringToObject<TypeOfTrack> {
    ConvertStringToTrack ConvertStringToTrack;
    @Override
    public TypeOfTrack convertString(String string) {

        return Arrays.stream(TypeOfTrack.values()).filter(track -> track.name().equals(string)).findAny().orElse(TypeOfTrack.DefaultTrack);
    }
}