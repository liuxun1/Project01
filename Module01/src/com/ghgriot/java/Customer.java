package com.ghgriot.java;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author lx
 * @create 2018/8/3 0003 15:08
 */
public class Customer {
    public static void main(String[] args) {

        try {
            FileInputStream fis=new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println();
    }
}


