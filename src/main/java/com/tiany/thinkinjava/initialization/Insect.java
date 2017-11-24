package com.tiany.thinkinjava.initialization;

/**
 * Created by tiany on 2017/11/23.
 */
public class Insect {
    private int i = 9;
    protected int j;
    private int n = printInit("Insect.n initalized");

    public Insect() {
        System.out.println("i = "+ i +", j ="+j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initalized");

    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
}
