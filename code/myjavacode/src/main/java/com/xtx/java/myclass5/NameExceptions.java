package com.xtx.java.myclass5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName NameExceptions
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/05
 **/
public class NameExceptions extends Exception {
    public NameExceptions(String message) {
        super(message);
    }
}
