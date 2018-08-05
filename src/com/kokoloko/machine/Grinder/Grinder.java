package com.kokoloko.machine.Grinder;

import com.kokoloko.coffee.beans.Bean;

public class Grinder {
    private Bean bean;
    private double amount;

    public Grinder(Bean bean, double amount) {
        this.bean = bean;
        this.amount = amount;
    }

    public Bean grind(double granularity) {
        bean.grind(granularity);
        return bean;
    }
}
