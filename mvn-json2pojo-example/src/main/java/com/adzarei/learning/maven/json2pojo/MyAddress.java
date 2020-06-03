package com.adzarei.learning.maven.json2pojo;

import com.adzarei.learning.maven.json2pojo.model.ShippingAddress;

public class MyAddress {
    public static void main(String[] args) {
        ShippingAddress address = new ShippingAddress();
        address.setLocality("Valencia");

        System.out.println(address.getLocality());
    }
}
