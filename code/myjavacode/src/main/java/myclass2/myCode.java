package myclass2;

import javafx.scene.chart.PieChart;
import javafx.util.Builder;

import java.util.Date;

/**
 * @ClassName myCode
 * @Description 主类
 * @Author Administrator
 * @Date 2020/10/15
 **/
public class myCode {
    public static void main(String[] args) {
        bookClass bc = new bookClass();
        bc.setBookName("我的世界");
        bc.setBookDate(new Date());
        bc.setPrice(100);
        bookClass bc1 = new bookClass("你的世界", 100, new Date());
        System.out.println(bc);
        System.out.println(bc1);
        bookClass bc2 = bookClass.builder()
                .bookName("你猜")
                .bookDate(new Date())
                .price(18).build();
        System.out.println(bc2);
    }
}
