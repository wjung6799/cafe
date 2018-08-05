package com.kokoloko.coffee.beans;

public interface Bean {
    public String getRoastType();
    public String getKind();
    public void grind(double granularity);
    public boolean isGround();
    public void roast();
}
