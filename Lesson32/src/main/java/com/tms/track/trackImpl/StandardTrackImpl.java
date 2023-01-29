package com.tms.track.trackImpl;

import com.tms.track.Track;

public class StandardTrackImpl implements Track {
    @Override
    public int difficulty() {
        return 5;
    }
    @Override
    public int distance() {
        return 500;
    }
}
