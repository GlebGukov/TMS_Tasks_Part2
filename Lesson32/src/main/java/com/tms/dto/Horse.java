package com.tms.dto;

public enum Horse {
    Arabian(Temperaments.Choleric),
    Belarusian(Temperaments.Phlegmatic),
    Thoroughbreds(Temperaments.Sanguine),
    Trotter(Temperaments.Melancholic);

    private final Temperaments temperaments;

    public Temperaments getTemperaments() {
        return temperaments;
    }

    Horse(Temperaments temperaments) {
        this.temperaments = temperaments;
    }

    public double run() {
        return getTemperaments().getCfAggression() + getTemperaments().getCfPatience() + getTemperaments().getCfStability();
    }
    @Override
    public String toString() {
        return "temperaments=" + temperaments;
    }

}
