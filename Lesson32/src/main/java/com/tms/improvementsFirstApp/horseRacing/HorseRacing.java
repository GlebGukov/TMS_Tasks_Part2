package com.tms.improvementsFirstApp.horseRacing;

import com.tms.improvementsFirstApp.track.TypeOfTrack;

public interface HorseRacing {

    void startCompetitions(TypeOfTrack track,CompetitorsService competitors, int cash);
}
