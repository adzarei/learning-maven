package com.adzarei.learning.maven.tests.pojo;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class JUnit5HelloWorldTest {

    @Test
    void getAndPrintMsg() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World", helloWorld.getAndPrintMsg());
    }
}