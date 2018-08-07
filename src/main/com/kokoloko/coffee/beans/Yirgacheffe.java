package com.kokoloko.coffee.beans;

public class Yirgacheffe implements Bean {
    private static final double BITTER_FLAVOR = 100.0;
    private double roastness;
    private boolean isGround;
    private double granularity;

    @Override
    public String getRoastType() {
        if(roastness/BITTER_FLAVOR < 0.25) {
            return "Light Roast";
        } else if (roastness/BITTER_FLAVOR < 0.5) {
            return "Medium Roast";
        } else if (roastness/BITTER_FLAVOR < 0.75) {
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
    public void grind(double granularity) {
        this.granularity = granularity;
    }

    @Override
    public boolean isGround() {
        return isGround;
    }

    @Override
    public void roast() {
        roastness++;
    }

    @Override
    public double getFlavor() {
        return roastness/BITTER_FLAVOR;
    }
}
