package com.tiany.thinkinjava.initialization;

/**
 * Created by tiany on 2017/11/20.
 */
public class MethodInit {
    int i = f();
    int j = g(i);

    int f(){
        return 1;
    }

    int g(int n){
        return n*10;
    }
}
