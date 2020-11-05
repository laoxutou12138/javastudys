package com.xtx.java.myclass5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName BookImpl
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/05
 **/
public class BookImpl implements MyBook {
    @Override
    public void grounding(Book book) throws IsbnException, NameException, PriceException {
        boolean a=false;
        String reg ="^[\\d]{13}$";
        Pattern pattern=Pattern.compile(reg);
        Pattern pattern1=Pattern.compile("(暴力|恐怖)");
        Matcher matcher=pattern.matcher(book.isbn);
        Matcher matcher1=pattern1.matcher(book.bookName);
        while (matcher1.find()){
            a=true;
        }
        if(!matcher.matches()){
            throw new PriceException("ISBN不是13位数字组成");
        }else if(a){
            throw new PriceException("书名中含有’暴力‘，’恐怖‘等禁词");
        }else if(book.price>100){
            throw new PriceException("价格超过100元!!");
        }else {
            System.out.println("上架成功");
        }
    }
}
