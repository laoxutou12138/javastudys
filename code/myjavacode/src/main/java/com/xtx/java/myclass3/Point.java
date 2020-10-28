package com.xtx.java.myclass3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Point
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/22
 **/

public class Point {
    protected double x;
    protected double y;
    public Point(){
        System.out.println("point被初始化");
    }
    public Point(double a,double b){
        this.x=a;
        this.y=b;
    }
    protected double compareDistance(Point p1){
        if(p1.x == this.x){
            return Math.abs(this.x-p1.x);
        }
        if(p1.y == this.y){
            return Math.abs(this.y-p1.y);
        }
        return Math.sqrt(Math.pow(p1.y - this.y,2) + Math.pow(this.x - p1.x,2));
    }
}
