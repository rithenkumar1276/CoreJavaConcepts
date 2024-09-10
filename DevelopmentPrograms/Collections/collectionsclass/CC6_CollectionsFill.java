package com.evergent.CoreJava.Collections.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 *Collections.fill()
This method replaces all elements of the specified list with the specified element.
Filling a List with a Specific Value
 */
public class CC6_CollectionsFill {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Display the original list
        System.out.println("Original list: " + list);

        // Filling the list with "X"
        Collections.fill(list, "MyJAVA");

        // Display the filled list
        System.out.println("Filled list: " + list);
    }
}