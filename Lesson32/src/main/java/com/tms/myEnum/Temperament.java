package com.tms.myEnum;

public enum Temperament {
    Choleric((Math.random()*(10-8)+8),(Math.random()*(6-4)+4),(Math.random()*(5-3)+3)),
    Sanguine((Math.random()*(9-6)+6),(Math.random()*(8-7)+7),(Math.random()*(10-6)+6)),
    Phlegmatic((Math.random()*(5-3)+3),(Math.random()*(10-5)+5),(Math.random()*(8-6)+6)),
    Melancholic((Math.random()*(5-2)+2),(Math.random()*(5-2)+2),(Math.random()*(6-4)+4));
    private final double cfAggression;
    private final double cfPatience;
    private final double cfStability;
    public double getCfAggression() {
        return cfAggression;
    }

    public double getCfPatience() {
        return cfPatience;
    }

    public double getCfStability() {
        return cfStability;
    }
    Temperament(double cfAggression, double cfPatience, double cfStability) {
        this.cfAggression = cfAggression;
        this.cfPatience = cfPatience;
        this.cfStability = cfStability;
    }
}
