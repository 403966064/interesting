package com.tiany.thinkinjava;

/**
 * Created by tiany on 2017/11/27.
 */
public class PrivateOverride {
    private void f(){
        System.out.println("private output!");
    }

    private void doPrivateThing(){
        System.out.println("PrivateOverride.doPrivateThing");
    }

    public static void main(String[] args) {
        PrivateOverride override = new Derived();
        override.f();
        override.doPrivateThing();

    }
}
