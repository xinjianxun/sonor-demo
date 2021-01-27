package com.example.sonor.illegle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ParentClass {


    public ParentClass() {

    }
    private static String name;

    public void sayHello() {
        System.out.println("hello");
    }

    private static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>();

    private static final ThreadLocal<DateFormat> df1 = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        } };

    public static void main(String[] args) {

        ParentClass parentClass = new ParentClass() {
            @Override
            public void sayHello() {

            }
        };
        String a = "123";
        String b = a +"456";
        Long warn = 1l;

//        String[] str = new String[] { "chen", "yang", "hao" };
//        List<String> list =  Arrays.asList(str);
//        str[2] = "abc";
//        System.out.println(list.get(2));

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");


        for (String item : list) {
            if ("3".equals(item)) {
                list.remove(item);
            }
        }

        for(String str : list) {
            System.out.println(str);
        }





    }

    private void  testMagicNumber() {
        for(int i=19;i<30;i++) {

        }
    }


}

