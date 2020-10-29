package com.xtx.java.myclass4;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName SuperStar
 * @Description TODO
 * @Author Administrator
 * @Date 2020/10/29
 **/
public class SuperStar implements Filmable,Singable,TVable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public SuperStar() {
        super();
    }

    public SuperStar(String name) {
        super();
        this.name = name;
    }

    @Override
    public void actFilm() {
        System.out.println(this.name+"演电影");
    }

    @Override
    public void showSing() {
        System.out.println(this.name+"会唱歌");
    }

    @Override
    public void showTV() {
        System.out.println(this.name+"演电视");
    }

    public void introduce(){
        System.out.println(name+"是三栖明星");
    }
}
