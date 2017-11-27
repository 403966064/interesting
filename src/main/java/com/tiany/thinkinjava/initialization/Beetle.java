package com.tiany.thinkinjava.initialization;

/**
 * Created by tiany on 2017/11/23.
 */
public class Beetle extends Insect {
    private int k = printInit("Beetle.k initalized");

    public Beetle() {
        System.out.println("k = "+ k);
        System.out.println("j = "+ j);
    }

    private static int x2 = printInit("static Beetle.x2 initalized");

    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle beetle = new Beetle();
    }

    /***
     * Beetle 的main 访问
     * 加载的过程中判断当前 main 方法所属的类是否含有基类
     * 优先加载 基类和导出类中的static实例域
     * 执行main方法。
     * 初始化基类 其他实例域 调用构造器方法
     * 初始化导出类 其他实例域 调用构造器方法
     */
}
