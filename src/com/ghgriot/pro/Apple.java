package com.ghgriot.pro;



/**
 * @author lx
 * @create 2018/8/3 0003 9:25
 */
public class Apple {
    public static void main(String[] args) {

    }

    private String id;
    private String name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apple() {
    }

    public Apple(String id) {
        this.id = id;
    }

    public Apple(String id, String name) {
        this.id = id;
        this.name = name;
    }





}
