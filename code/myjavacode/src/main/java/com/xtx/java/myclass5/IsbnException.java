package com.xtx.java.myclass5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName BookExceptions
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/05
 **/
public class IsbnException extends Exception {
    public IsbnException(String message) {
        super(message);
    }
}
