package com.tms;

public class StandardTrackImpl implements Track {
    private final int difficulty = 7;

    @Override
    public int difficulty() {
        return difficulty;
    }
}
