package com.tiany.designpatterns.Beverage;

/**
 * Created by tiany on 2017/11/3.
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "houseblend";
    }

    @Override
    public double cost(){
        return .89;
    }

    @Override
    public double getSizeCost() {
        switch (getSize()){
            case 2:
                return 0.6;
            case 1:
                return 0.4;
            case 0:
                return 0.2;
            default:
                return 0;
        }
    }
}
