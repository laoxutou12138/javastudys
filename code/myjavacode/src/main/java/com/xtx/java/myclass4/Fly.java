package com.xtx.java.myclass4;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Fly
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/29
 **/
public interface Fly {
    String Name = "HomeLander";
    int Speed=100000;

    /**
     * 祖国人
     * @param name
     * @param speed
     */
    void fly(String name,int speed);
}
