package com.xtx.java.myclass4;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName MyComparable
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/29
 **/
public interface MyComparable {
    /**
     * 比较
     * @param obj 参照对象
     * @return >0 大于 =0等于 <0小于
     */
    int compareTo(Object obj);
}
