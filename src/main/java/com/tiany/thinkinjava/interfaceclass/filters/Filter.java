package com.tiany.thinkinjava.interfaceclass.filters;

/**
 * Created by tiany on 2017/11/30.
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform waveform){
        return waveform;
    }
}
