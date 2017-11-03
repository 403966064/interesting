package com.tiany.designpatterns.Beverage;

/**
 * Created by tiany on 2017/11/3.
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "mocha " + beverage.getDescription();
    }

    @Override
    public double cost() {
        return 0.20 +getSizeCost()+ beverage.cost();
    }

    @Override
    public double getSizeCost() {
        switch (beverage.getSize()){
            case 2:
                return 0.3;
            case 1:
                return 0.2;
            case 0:
                return 0.1;
            default:
                return 0;
        }
    }
}
