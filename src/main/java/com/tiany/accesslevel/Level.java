package com.tiany.accesslevel;

/**
 * Created by tiany on 2017/7/21.
 * 访问范围为 同一类，同一包，父子类，全局
 */
public class Level extends SuperLevel {
    public String publicLevel; //同一类，同一包，父子类，全局

    protected String protectedLevel;//同一类，同一包，父子类

    String noModifyLevel;  //同一类，同一包

    private String privateLevel; //同一类

}
