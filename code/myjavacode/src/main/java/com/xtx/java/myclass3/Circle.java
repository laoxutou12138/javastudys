package com.xtx.java.myclass3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/22
 **/
public class Circle extends Point {
    private int r;

    public Circle() {
        super();
        System.out.println("Circle被初始化");
    }

    public Circle(int a, int b, int r) {
        super(a, b);
        this.r = r;
    }


}
