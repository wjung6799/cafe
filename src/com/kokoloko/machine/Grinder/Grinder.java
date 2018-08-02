package com.kokoloko.machine.Grinder;

import com.kokoloko.coffee.beans.Bean;
import com.kokoloko.coffee.ground.Ground;

public class Grinder {
    private Bean bean;
    private double weight;

    public Grinder(Bean bean, double weight) {
        this.bean = bean;
        this.weight = weight;
    }

    public Ground grind() {
        Ground ground = new Ground(bean);
        return ground;
    }
}
