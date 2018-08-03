package com.kokoloko.coffee.beans;

public class Yirgacheffe implements Bean {
    private static final double FLAVOR = 100.0;
    private double roastness;

    @Override
    public String getRoastType() {
        if(roastness/FLAVOR < 0.25) {
            return "Light Roast";
        } else if (roastness/FLAVOR < 0.5) {
            return "Medium Roast";
        } else if (roastness/FLAVOR < 0.75) {
            return "Medium Dark Roast";
        } else {
            return "Dark Roast";
        }
    }

    @Override
    public String getKind() {
        return "Yirgacheffe";
    }

    @Override
    public void roast() {
        roastness++;
    }
}
