package com.adzarei.learning.maven.json2pojo;

import com.adzarei.learning.maven.json2pojo.model.ShippingAddress;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyAddressTest {

    @Test
    public void testShippingAddress() {
        ShippingAddress address = new ShippingAddress();

        System.out.println(address.getClass());
        assertEquals("class com.adzarei.learning.maven.json2pojo.model.ShippingAddress", address.getClass().toString());
    }
}