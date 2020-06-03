package com.adzarei.learning.maven.tests.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HelloWorldTest {

    @Test
    public void testGetAndPrintMsg() {
        HelloWorld helloWorld = new HelloWorld();
        Assert.assertEquals("Hello World",helloWorld.getAndPrintMsg());
    }
}