package com.tiany.thinkinjava.interfaceclass.filters;

/**
 * Created by tiany on 2017/11/30.
 */
public class BandPass extends Filter {
    double lowCutoff, highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    public Waveform process(Waveform waveform){
        return waveform;
    }

    public boolean contain(int[] noAdd, int n){
        for(int num : noAdd){
            if(num == n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BandPass bandPass = new BandPass(1.0, 2.0);
        int[] noAdd = {15414,15441,15459, 15463, 15472, 15482, 15488, 15489, 15491};
        StringBuffer str = new StringBuffer();
        for(int n = 15387; n <= 15491; n++){
            if(!bandPass.contain(noAdd, n)){
                if(str.length() != 0){
                    str.append(":");
                }
                str.append(n);
            }
        }
        System.out.println(str.toString());
    }

}
