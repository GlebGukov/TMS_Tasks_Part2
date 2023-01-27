package com.tms.myEnum;

public enum Temperament {
    Choleric((Math.random()*(10-8)+8),(Math.random()*(7-5)+5),(Math.random()*(7-5)+5)), // 8-10; 5-7; 5-7 18-24
    Sanguine((Math.random()*(7-5)+5),(Math.random()*(8-6)+6),(Math.random()*(9-6)+6)), // 5-7; 6-8; 6-9 17-24
    Phlegmatic((Math.random()*(5-3)+3),(Math.random()*(10-5)+5),(Math.random()*(8-6)+6)), // 3-5; 5-10; 6-8;  14-23
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
