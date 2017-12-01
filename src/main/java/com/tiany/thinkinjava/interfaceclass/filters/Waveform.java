package com.tiany.thinkinjava.interfaceclass.filters;

/**
 * Created by tiany on 2017/11/30.
 */
public class Waveform {
    private static long counter;

    private final long id = counter++;

    public String toString(){
        return "Waveform : "+ id;
    }
}
