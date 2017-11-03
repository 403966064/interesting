package com.tiany.designpatterns.Beverage;

/**
 * Created by tiany on 2017/11/3.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(Beverage.Size.BIG.ordinal());
        System.out.println(beverage.getDescription() + ": $"+beverage.cost() + ", size："+ beverage.getSize());

        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + ": $"+beverage.cost() + ", size："+ beverage.getSize());

        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + ": $"+beverage.cost() + ", size："+ beverage.getSize());
    }
}
