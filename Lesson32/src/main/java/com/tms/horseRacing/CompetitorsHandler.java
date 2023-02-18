package com.tms.horseRacing;

import com.tms.jockey.Jockey;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompetitorsHandler {
    void saveCompetitors(Jockey... jockeys);

    List<Jockey> getCompetitors();

}
