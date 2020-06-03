package com.adzarei.learning.maven.tests.pojo;

public class HelloWorld {

    private String msg = "Hello World";

    public String getAndPrintMsg() {
        System.out.println(msg);
        return msg;
    }
}
