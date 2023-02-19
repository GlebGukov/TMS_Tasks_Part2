package com.tms.dto.horseRacing;

import com.tms.dto.jockey.Jockey;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompetitorsHandler {
    void saveCompetitors(Jockey... jockeys);

    List<Jockey> getCompetitors();

}
