package com.tiany.java8;

/**
 * Created by tiany on 2017/8/9.
 */
public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
