package com.evergent.CoreJava.Collections.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CC2_Collections {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Pineapple");

        // Display the original list
        System.out.println("Original list: " + fruits);

        // Sorting the list in natural order (alphabetical order)
        Collections.sort(fruits);

        // Display the sorted list
        System.out.println("Sorted list: " + fruits);
    }
}