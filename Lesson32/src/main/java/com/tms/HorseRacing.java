package com.tms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HorseRacing {
    private Jockey jockey;
    private Track track;


    void StartCompetitions (Track track, Jockey...jockeys){
        int cfTrack = track.difficulty();
        for (Jockey j:jockeys) {
            double jCf = j.pairCf() / cfTrack;

        }


    }
}
