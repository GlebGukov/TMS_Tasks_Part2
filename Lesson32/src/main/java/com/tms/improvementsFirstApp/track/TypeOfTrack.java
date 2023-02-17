package com.tms.improvementsFirstApp.track;

public enum TypeOfTrack {
    DifficultTrack(10, 1000),
    EasyTrack(3, 200),
    DefaultTrack(6, 600);
    private final int difficulty;
    private final int distance;

    public int getDifficulty() {
        return difficulty;
    }

    public int getDistance() {
        return distance;
    }

    TypeOfTrack(int difficulty, int distance) {
        this.difficulty = difficulty;
        this.distance = distance;
    }
}
