package com.kokoloko.coffee;

public class Milk {
    public int foam;
    public int milk;

    public Milk(int amount) {
        milk = amount;
        foam = 0;
    }

    public void steamed() {
        milk--;
        foam += 2;
    }
}
