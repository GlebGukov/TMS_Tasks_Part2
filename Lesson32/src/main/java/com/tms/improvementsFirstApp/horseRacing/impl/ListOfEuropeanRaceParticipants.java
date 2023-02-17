package com.tms.improvementsFirstApp.horseRacing.impl;

import com.tms.improvementsFirstApp.horseRacing.CompetitorsService;
import com.tms.improvementsFirstApp.jockey.Jockey;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Data
public class ListOfEuropeanRaceParticipants implements CompetitorsService {
    List <Jockey> competitors = new ArrayList<>();

    @Override
    public String toString() {
        return "ListOfEuropeanRaceParticipants" +
                "competitors=" + competitors ;
    }

    @Override
    public List<Jockey> saveCompetitors(Jockey... jockeys) {
        Collections.addAll(competitors, jockeys);
        return competitors;
    }

    @Override
    public List<Jockey> getCompetitors() {
        return competitors;
    }
}
