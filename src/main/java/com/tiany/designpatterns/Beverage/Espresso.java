package com.tiany.designpatterns.Beverage;

/**
 * Created by tiany on 2017/11/3.
 */
public class Espresso extends Beverage{
    public Espresso() {
        description = "espresso";
    }

    @Override
    public double cost(){
        return getSizeCost() + 1.99;
    }

    @Override
    public double getSizeCost() {
        switch (getSize()){
            case 2:
                return 0.5;
            case 1:
                return 0.3;
            case 0:
                return 0.1;
            default:
                return 0;
        }
    }
}
