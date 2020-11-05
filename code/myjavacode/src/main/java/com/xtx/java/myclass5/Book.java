package com.xtx.java.myclass5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Books
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/05
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    public String isbn;
    public String bookName;
    public Double price;
}
