package com.tiany.thinkinjava;

/**
 * Created by tiany on 2017/11/27.
 */
public class Derived extends PrivateOverride{
    public void f(){
        System.out.println("public output!!");
    }

    public void doSomething(){
        System.out.println("private dosomething!!");
    }
}
