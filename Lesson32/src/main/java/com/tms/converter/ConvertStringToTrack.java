package com.tms.converter;

import com.tms.dto.TypeOfTrack;

import java.util.Arrays;

public class ConvertStringToTrack implements ConvertStringToObject {
    @Override
    public TypeOfTrack convertString(String string) {
        if (Arrays.stream(TypeOfTrack.values()).anyMatch(track -> track.name() == string)){
            return TypeOfTrack.valueOf(string);
        }
        else return TypeOfTrack.DefaultTrack;
    }
}
