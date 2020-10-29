package com.xtx.java.myclass4;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.omg.CORBA.INTERNAL;
import org.omg.PortableInterceptor.INACTIVE;

/**
 * @ClassName News
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/29
 **/
public class News implements MyComparable {
    private Integer id;
    private  String title;
    private String content;
    private String type;
    private Integer reacCount;

    public News(Integer id, String title, String content, String type, Integer reacCount) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.type = type;
        this.reacCount = reacCount;
    }

    @Override
    public int compareTo(Object obj) {
        //把比较对象转化成具体的News类型
        News other= (News) obj;
        return this.reacCount-other.reacCount;
    }

    @Override
    public  String toString(){
        return "News:[id="+this.id+",title="+this.title+"content="+this.content+"type="+this.type+"readCount="+this.reacCount.toString()+"]";
    }
}
