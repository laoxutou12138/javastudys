package com.xtx.java.myclass5;

/**
 * @ClassName BookMain
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/05
 **/
public class BookMain {
    public static void main(String[] args) {
        Book book=Book.builder().isbn("1125a").bookName("恐怖故事").price(20.0).build();
        Book book1=Book.builder().isbn("11252221").bookName("恐怖故事").price(20.0).build();
        Book book2=Book.builder().isbn("1234567891025").bookName("恐怖故事").price(20.0).build();
        Book book3=Book.builder().isbn("1234567891025").bookName("故事").price(110.0).build();
        Book book4=Book.builder().isbn("1234567891025").bookName("故事").price(80.0).build();
        MyBook mb=new BookImpl();
        try{
            mb.grounding(book);
        }catch (IsbnException | NameException | PriceException e){
            System.err.println(e.getMessage());
        }
        try {
            mb.grounding(book1);
        }catch (IsbnException | NameException | PriceException e){
            System.err.println(e.getMessage());
        }
        try{
            mb.grounding(book2);
        }catch (IsbnException | NameException | PriceException e){
            System.err.println(e.getMessage());
        }
        try {
            mb.grounding(book3);
        }catch (IsbnException | NameException | PriceException e){
            System.err.println(e.getMessage());
        }
        try {
            mb.grounding(book4);
        }catch (IsbnException | NameException | PriceException e){
            System.err.println(e.getMessage());
        }
    }
}
