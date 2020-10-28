package com.xtx.java.myclass2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @ClassName myCode
 * @Description 主类
 * @Author Administrator
 * @Date 2020/10/15
 **/
public class MyCode {
    public static void main(String[] args) {
        StudentClass sc= StudentClass.builder()
                .studentName("laoxu")
                .id("1001")
                .gender("male")
                .phone(PhoneClass.builder().brand("HuaWei").price(5200).build())
                .build();
        BookClass[] bc=new BookClass[]{
                BookClass.builder().bookName("Mc").price(15).bookDate(new Date()).build(),
                BookClass.builder().bookName("Wow").price(30).bookDate(new Date()).build(),
                BookClass.builder().bookName("AC").price(40).bookDate(new Date()).build(),
        };
        List<BookClass> bc1=new ArrayList<BookClass>(Arrays.asList(bc));
        sc.setBooks(bc1);
        for (BookClass bookClass : bc1) {
            System.out.println(bookClass.getBookName());
        }
        //bc1.forEach(bookClass -> System.out.println(bookClass.getBookName()));
    }
}
