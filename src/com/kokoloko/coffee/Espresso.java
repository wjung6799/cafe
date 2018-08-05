package com.kokoloko.coffee;

import com.kokoloko.coffee.beans.Bean;

public class Espresso {
    private double flavor;

    public Espresso(Bean bean) {
        flavor = bean.getFlavor();
    }
}
