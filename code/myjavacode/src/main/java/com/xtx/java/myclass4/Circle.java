package com.xtx.java.myclass4;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/29
 **/
public class Circle extends baseShape {
    private final Integer r;

    public Circle(Integer r) {
        super();
        System.out.println("子类");
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }

    @Override
    public void getName() {
        super.getName();
        System.out.println("This is a Circle");
    }

    public void printArea(){
        System.out.println(this.getArea());
    }
}
