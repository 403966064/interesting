package com.tiany.algorithm.exercises;

/**
 * Created by tiany on 2017/8/4.
 */
public class chapter1 {

    //1.1.3 编写一个程序， 从命令行得到三个整数参数。 如果它们都相等则打印 equal， 否则打印 not equal
    public static void equalsThird(int param1, int param2, int param3){
        if(param1 == param2 && param1 == param3){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }

    //1.1.5 编写一段程序， 如果 double 类型的变量 x 和 y 都严格位于 0 和 1 之间则打印 true， 否则打印false。
    public static void range(double x, double y){
        if((0 <= x && x <= 1 ) && (0 <= y && y <= 1 )){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        //chapter1.equalsThird(1, 1, 1);
        //chapter1.range(0.5, 1.8);
        System.out.println('b');
        System.out.println('b' + 'c');   // a 65 b 66  c 67
        System.out.println((char) ('a' + 4));
    }
}
