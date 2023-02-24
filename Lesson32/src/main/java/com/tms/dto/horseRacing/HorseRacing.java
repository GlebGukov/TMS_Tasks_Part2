package com.tms.dto.horseRacing;

import com.tms.dto.Jockey;
import com.tms.dto.TypeOfTrack;
import com.tms.service.ListJockey;

public interface HorseRacing {

    String startCompetitions(ListJockey listJockey, TypeOfTrack track, int cash);
}
