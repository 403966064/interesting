package com.tiany.java8;

/**
 * Created by tiany on 2017/8/9.
 */
public class Apple {
    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    private String color;

    private double weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
