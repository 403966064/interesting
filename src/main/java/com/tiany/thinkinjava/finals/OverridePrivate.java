package com.tiany.thinkinjava.finals;

/**
 * Created by tiany on 2017/11/23.
 */
public class OverridePrivate extends WithFinals {
    @Override
    public final void doSomething(){
        System.out.println("OverridePrivate.doSomething");
    }
    @Override
    public void doSomeElseThing(){
        System.out.println("OverridePrivate.doSomeElseThing");
    }

    public static void main(String[] args) {
        OverridePrivate overridePrivate = new OverridePrivate();
        overridePrivate.doSomething();
        overridePrivate.doSomeElseThing();

        WithFinals withFinals = overridePrivate;
        withFinals.doSomething();
        withFinals.doSomeElseThing();
    }
}
