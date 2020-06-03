package com.adzarei.learning.maven.tests.reports;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void getAndPrintMsg() {
        HelloWorld helloWorld = new HelloWorld();
        assert("Hello World".equals(helloWorld.getAndPrintMsg()));
    }
}