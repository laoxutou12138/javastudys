package myclass2;

import lombok.*;

import java.util.Date;

/**
 * @ClassName bookClass
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/15
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class bookClass {
    private String bookName;
    private Integer price;
    private Date bookDate;
}
