package com.example.sonor.illegle;

public class SwitchString {
    public static void main(String[] args) {
        method ("sth");
    }
    public static void method(String param) {
        switch(param) {
            case "sth":
                System.out.println("it's sth");
                break;
            case "null":
                System.out.println("it's null");
                break;
            default:
                System.out.println("default");
        }
    }
}
