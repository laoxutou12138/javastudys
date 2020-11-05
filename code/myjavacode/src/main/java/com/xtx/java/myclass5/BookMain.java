package com.xtx.java.myclass5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName BookMain
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/05
 **/
public class BookMain {
    public static void main(String[] args) {
        Book book=Book.builder().ISBN("1125a").BookName("恐怖故事").Price(20.0).build();
        Book book1=Book.builder().ISBN("11252221").BookName("恐怖故事").Price(20.0).build();
        Book book2=Book.builder().ISBN("1234567891025").BookName("恐怖故事").Price(20.0).build();
        Book book3=Book.builder().ISBN("1234567891025").BookName("故事").Price(110.0).build();
        Book book4=Book.builder().ISBN("1234567891025").BookName("故事").Price(80.0).build();
        Mybook mb=new BookImpl();
        try {
            mb.ShangJia(book);
        }catch (ISBNExceptions|NameExceptions|PriceExceptions e){
            System.err.println(e.getMessage());
        }
        try {
            mb.ShangJia(book1);
        }catch (ISBNExceptions|NameExceptions|PriceExceptions e){
            System.err.println(e.getMessage());
        }
        try {
            mb.ShangJia(book2);
        }catch (ISBNExceptions|NameExceptions|PriceExceptions e){
            System.err.println(e.getMessage());
        }
        try {
            mb.ShangJia(book3);
        }catch (ISBNExceptions|NameExceptions|PriceExceptions e){
            System.err.println(e.getMessage());
        }
        try {
            mb.ShangJia(book4);
        }catch (ISBNExceptions|NameExceptions|PriceExceptions e){
            System.err.println(e.getMessage());
        }
    }
}
