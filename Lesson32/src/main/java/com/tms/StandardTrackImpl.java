package com.tms;

public class StandardTrackImpl implements Track {
    @Override
    public int difficulty() {
        return 7;
    }
    @Override
    public int distance() {
        return 500;
    }
}
