package com.xtx.java.myclass4;

import com.sun.org.glassfish.external.statistics.AverageRangeStatistic;

/**
 * @ClassName BaseShape
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/29
 **/
public abstract class baseShape {
    private static String name;

    public baseShape() {
        System.out.println("父类");
    }

    /**
     *
     */

    public abstract double getArea();
    public void getName(){
        System.out.println("this is an Abstract");
    }
}
