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
    private Point center;

    public Circle() {
        super();
        //super();
        System.out.println("Circle被初始化");
    }

    public Circle(Point p1,int r) {
        super(p1.x, p1.y);
        this.center=p1;
        this.r = r;
    }

    protected String compareCircle(Point p2){
        if(this.center.compareDistance(p2)>this.r)
        {
            return "该点不在此圈内";
        }
        return "该点在此圈内";
    }
}
