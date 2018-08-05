package com.kokoloko.machine;

import com.kokoloko.Exception.BeanNotGroundException;
import com.kokoloko.coffee.Coffee;
import com.kokoloko.coffee.beans.Bean;
import com.kokoloko.milk.Milk;

public class EspressoMachine {
    Bean bean;
    Milk milk;
    Coffee coffee;

    public EspressoMachine(Bean groundBean, Milk milk) {
        if(!groundBean.isGround()) {
            throw new BeanNotGroundException("The bean is not ground!");
        }
        this.bean = groundBean;
        this.milk = milk;
    }

    public void brewEspresso() {

    }
}
