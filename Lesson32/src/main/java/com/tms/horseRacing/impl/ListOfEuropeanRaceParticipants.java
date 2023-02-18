package com.tms.horseRacing.impl;

import com.tms.horseRacing.CompetitorsHandler;
import com.tms.jockey.Jockey;
import lombok.Data;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
@Component
@Value
public class ListOfEuropeanRaceParticipants implements CompetitorsHandler {
    List<Jockey> competitors = new ArrayList<>();


    @Override
    public String toString() {
        return "ListOfEuropeanRaceParticipants" +
                "competitors=" + getCompetitors();
    }

    @Override
    @Autowired
    public void saveCompetitors(Jockey... jockeys) {
        Collections.addAll(competitors, jockeys);
    }

    @Override
    public List<Jockey> getCompetitors() {
        return competitors;
    }
}
