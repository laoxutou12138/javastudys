package com.xtx.java.myclass5;

import jdk.nashorn.internal.runtime.regexp.RegExp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName BookImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/05
 **/
public class BookImpl implements Mybook{
    @Override
    public void ShangJia(Book book) throws ISBNExceptions, NameExceptions, PriceExceptions {
        boolean a=false;
        String reg ="^[\\d]{13}$";
        Pattern pattern=Pattern.compile(reg);
        Pattern pattern1=Pattern.compile("(暴力|恐怖)");
        Matcher matcher=pattern.matcher(book.ISBN);
        Matcher matcher1=pattern1.matcher(book.BookName);
        while (matcher1.find()){
            a=true;
        }
        if(!matcher.matches()){
            throw new PriceExceptions("ISBN不是13位数字组成");
        }else if(a){
            throw new PriceExceptions("书名中含有’暴力‘，’恐怖‘等禁词");
        }else if(book.Price>100){
            throw new PriceExceptions("价格超过100元!!");
        }else {
            System.out.println("上架成功");
        }
    }
}
