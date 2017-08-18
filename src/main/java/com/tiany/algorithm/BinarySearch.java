package com.tiany.algorithm;

/**
 * Created by tiany on 2017/8/3.
 * 二分查找法
 */
public class BinarySearch {
    public static int rank(int key, int[] a){
        int lo = 0;
        int hi = a.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(key < a[mid])
                hi = mid -1;
            else if(key > a[mid])
                lo = mid +1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        /*int[] whitelist = new int[]{1,2,6,3,2,7};
        Arrays.sort(whitelist);
        System.out.println(whitelist.toString());
        int key = 3;
        if(rank(key, whitelist) < 0){
            System.out.println(key);
        }*/
        System.out.println(2.0e-6 * 100000000.1);
    }
}
