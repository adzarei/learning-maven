package com.adzarei.learning.maven.jaxb;

import com.adzarei.learning.maven.jaxb.model.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingListTest {

    @Test
    public void main() {
        Product p1 = new Product();
        p1.setProductDescription("Milk");
        p1.setProductId(1);
        p1.setProductPrice(10.0);

        System.out.println(p1.getClass());
        System.out.println(p1.getProductId());
        System.out.println(p1.getProductDescription());
        System.out.println(p1.getProductPrice());

        assertEquals(1, p1.getProductId());
        assertEquals("Milk", p1.getProductDescription());
        assertEquals(10.0, p1.getProductPrice());
        assertEquals("class com.adzarei.learning.maven.jaxb.model.Product", p1.getClass().toString());
    }
}