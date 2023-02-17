package com.tms.improvementsFirstApp.horseRacing;

import com.tms.improvementsFirstApp.jockey.Jockey;

import java.util.List;

public interface CompetitorsService {
    List <Jockey> saveCompetitors(Jockey... jockeys);
    List <Jockey> getCompetitors();

}
