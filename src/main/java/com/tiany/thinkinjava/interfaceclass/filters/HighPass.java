package com.tiany.thinkinjava.interfaceclass.filters;

/**
 * Created by tiany on 2017/11/30.
 */
public class HighPass extends Filter {

    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform waveform){
        return waveform;
    }
}
