package com.tms.track.trackImpl;

import com.tms.track.Track;

public class DifficultTrackImpl implements Track {
    @Override
    public int difficulty() {
        return 10;
    }

    @Override
    public int distance() {
        return 1000;
    }
}
