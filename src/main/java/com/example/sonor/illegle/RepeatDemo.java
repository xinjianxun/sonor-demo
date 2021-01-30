package com.example.sonor.illegle;

import java.math.BigDecimal;

public class RepeatDemo {

    public void method1(String type) {
        if(type == null || type.equals("")) {
            type = "1";
        }
        BigDecimal sum = new BigDecimal("76.4444");
        if("2".equals(type)) {
            sum.add(new BigDecimal("3333.444"));
        }
        System.out.println(sum);
    }

    public void method2(String type) {
        if(type == null || type.equals("")) {
            type = "1";
        }
        BigDecimal sum = new BigDecimal("76.4444");
        if("2".equals(type)) {
            sum.add(new BigDecimal("3333.444"));
        }
        System.out.println(sum);
    }


}
