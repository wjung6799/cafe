package com.kokoloko.coffee.ground;

import com.kokoloko.coffee.beans.Bean;

public class Ground {
    private Bean bean;
    private double granularity;
    private double amount;

    public Ground(Bean bean) {
        this.bean = bean;
    }


    public double getGranularity() {
        return granularity;
    }

    public void setGranularity(double granularity) {
        this.granularity = granularity;
    }
}
