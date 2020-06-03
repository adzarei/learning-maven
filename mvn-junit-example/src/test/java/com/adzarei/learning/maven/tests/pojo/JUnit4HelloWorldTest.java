package com.adzarei.learning.maven.tests.pojo;

import org.junit.Test;

import static org.junit.Assert.*;

// JUnit 4 Pojo Unit Test.
public class JUnit4HelloWorldTest {

    @Test
    public void getAndPrintMsg(){
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World", helloWorld.getAndPrintMsg());
    }

}