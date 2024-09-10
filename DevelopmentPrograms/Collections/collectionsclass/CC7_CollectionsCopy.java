package com.evergent.CoreJava.Collections.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 *Collections.copy()
This method copies elements from one list into another. The destination list must be of the same size or greater.

Copying Elements from One List to Another
 */
public class CC7_CollectionsCopy {
    public static void main(String[] args) {
        List<String> sourceList = new ArrayList<>();
        sourceList.add("Apple");
        sourceList.add("Banana");
        sourceList.add("Cherry");

        List<String> destList = new ArrayList<>(sourceList.size());
        destList.add("");
        destList.add("");
        destList.add("");

        // Display the original lists
        System.out.println("Source list: " + sourceList);
        System.out.println("Destination list before copy: " + destList);

        // Copying elements from sourceList to destList
        Collections.copy(destList, sourceList);

        // Display the destination list after copying
        System.out.println("Destination list after copy: " + destList);
    }
}