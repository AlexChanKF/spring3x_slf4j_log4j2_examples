package com.mkyong.core;

/**
 * Spring bean
 */

public class HelloWorld {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        String message = "Spring 3 : Hello ! " + name;
        System.out.println("console level" + message);
    }

}