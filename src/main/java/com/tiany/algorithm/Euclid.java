package com.tiany.algorithm;

/**
 * Created by tian on 17/8/2.
 * 欧几里得算法
 * 找出两个数的最大公约数
 */
public class Euclid {

    //辗转相除法
    public static int gcd(int p, int q){
        if(q == 0){
            return p;
        }
        int r = p%q;
        return gcd(q, r);
    }

    //更相减损法
    public static int gcd1(int p, int q){
        if(p == q){
            return q;
        }
        //判断当前两个数能否被2整除
        if(p%2 == 0 && q%2 == 0){
            return gcd1(p/2, q/2)*2;
        }
        if(p > q){
            int result = p - q;
            return gcd1(result ,q);
        }else{
            int result = q- p;
            return gcd1(p, result);
        }

    }

    public static void main(String[] args) {
        System.out.println("gcd1---->"+Euclid.gcd1(8, 166432));

        System.out.println("gcd---->"+Euclid.gcd(8, 166432));
    }
}
