package com.tiany.javacoreprogram;

public class ClassMain {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
    }

    /**
     * result --->
     * 类的加载顺序是自上而下的。
     * 优先加载父类，然后才是子类
     *
     */
}
