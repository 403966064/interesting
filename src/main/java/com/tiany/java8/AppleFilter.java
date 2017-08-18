package com.tiany.java8;

import java.util.*;

/**
 * Created by tiany on 2017/8/9.
 */
public class AppleFilter{

    //筛选绿苹果
    public static List<Apple> filterGreenApples(List<Apple> inventory, String color){
        List<Apple> apples = new ArrayList<>();
        for(Apple apple : inventory){
            if(color.equals(apple.getColor())){
                apples.add(apple);
            }
        }
        return apples;
    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){
        List<Apple> result= new ArrayList<>();
        for(Apple apple: inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<T>();
        for(T e:list){
            if(p.test(e)){
                result.add(e);
            }
        }
        return result;
    }

    /**
     * 匿名类
     */

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple("green", 80),
                new Apple("green", 150),
                new Apple("red", 120));
        List<Apple> redApples = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        System.out.println("redApples"+redApples.toString());

        //Lambda 表达式
        List<Apple> result = filterApples(inventory, (Apple apple) -> "red".equals(apple.getColor()));
        System.out.println("result"+result.toString());
        inventory.sort((Apple apple1, Apple apple2) -> ((int) apple1.getWeight() - (int) apple2.getWeight()));
        inventory.sort(Comparator.comparing(Apple::getWeight).reversed().
                thenComparing(Apple::getColor));
        /*
        List<Integer> params= new ArrayList<>();
        params.add(1);
        params.add(9);
        params.add(5);
        params.add(7);
        params.add(4);
        Collections.sort(params, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               if(o1 > o2){
                   return 1;
               }else if(o1 < o2){
                   return -1;
               }
               return 0;
            }
        });
        System.out.println(params);*/

        /*System.out.println(new DecimalFormat("0.00").format(
                new BigDecimal("294.203").setScale(0, BigDecimal.ROUND_HALF_UP)));*/

    }
}
