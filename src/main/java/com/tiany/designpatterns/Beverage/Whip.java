package com.tiany.designpatterns.Beverage;

/**
 * Created by tiany on 2017/11/3.
 */
public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "whip "+ beverage.getDescription();
    }

    @Override
    public double cost() {
        return 0.10+ getSizeCost()+ beverage.cost();
    }

    @Override
    public double getSizeCost() {
        switch (beverage.getSize()){
            case 2:
                return 0.34;
            case 1:
                return 0.24;
            case 0:
                return 0.14;
            default:
                return 0;
        }
    }
}
