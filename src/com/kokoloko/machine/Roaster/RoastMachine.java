package com.kokoloko.machine.Roaster;

import com.kokoloko.coffee.beans.Bean;

public class RoastMachine {
    Bean bean;

    public RoastMachine(Bean bean) {
        this.bean = bean;
    }

    public void Roast() {
        bean.roast();
    }

    public Bean getBean() {
        return bean;
    }
}
