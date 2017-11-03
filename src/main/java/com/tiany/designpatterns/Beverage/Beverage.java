package com.tiany.designpatterns.Beverage;

/**
 * Created by tiany on 2017/11/3.
 */
public abstract class Beverage {
    String description = "unknown Beverage";

    int size;

    public enum Size{
        LITTLE,
        MIDDEL,
        BIG
    }

    public String getDescription(){
        return description;
    }

    public abstract double cost();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract double getSizeCost();
}
