package com.evergent.CoreJava.Collections.collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 *Collections.max() and Collections.min()
These methods return the maximum and minimum elements in the specified collection, according to the natural ordering or a specified comparator.
 */
public class CC5_CollectionsMaxMin {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(5);
        numbers.add(15);

        // Finding the maximum element
        int max = Collections.max(numbers);

        // Finding the minimum element
        int min = Collections.min(numbers);

        // Displaying the results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}