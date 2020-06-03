package com.adzarei.learning.maven.tests.pojo;

// Simple test.
// Maven Sure fire looks for public classes starting or ending with 'Test';
public class HelloWorldTest {

    // Maven SureFire looks for public methods that start with 'test';
    public void testGetMsg() {
        HelloWorld helloWorld = new HelloWorld();
        assert("Hello World".equals(helloWorld.getAndPrintMsg()));
    }
}