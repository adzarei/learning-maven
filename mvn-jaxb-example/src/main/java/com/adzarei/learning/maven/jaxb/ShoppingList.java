package com.adzarei.learning.maven.jaxb;

import com.adzarei.learning.maven.jaxb.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    public static void main(String[] args) {
        List<Product> shoppingList = new ArrayList<>();

        Product p1 = new Product();
        p1.setProductDescription("Milk");

        Product p2 = new Product();
        p2.setProductDescription("Coffee");

        Product p3 = new Product();
        p3.setProductDescription("Biscuits");

        Product p4 = new Product();
        p4.setProductDescription("Tea");

        shoppingList.add(p1);
        shoppingList.add(p2);
        shoppingList.add(p3);
        shoppingList.add(p4);

        System.out.println("Checking my Shopping List!");
        System.out.println("I must buy:");
        shoppingList.forEach(
                product -> System.out.println(product.getProductDescription())
        );
        System.out.println("End of my Shopping List.");

    }

}
