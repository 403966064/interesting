package com.tiany.java8;

/**
 * Created by tiany on 2017/8/9.
 */
public class AppleHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
