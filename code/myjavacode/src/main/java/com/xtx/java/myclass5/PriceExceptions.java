package com.xtx.java.myclass5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName PriceExceptions
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/05
 **/
public class PriceExceptions extends Exception {
    public PriceExceptions(String message) {
        super(message);
    }
}
