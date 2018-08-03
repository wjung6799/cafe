package com.kokoloko.machine.Grinder;

import com.kokoloko.coffee.beans.Bean;
import com.kokoloko.coffee.ground.Ground;

public class Grinder {
    private Bean bean;
    private double amount;

    public Grinder(Bean bean, double amount) {
        this.bean = bean;
        this.amount = amount;
    }

    public Ground grind(double granularity) {
        Ground ground = new Ground(bean);
        ground.setGranularity(granularity);
        return ground;
    }
}
