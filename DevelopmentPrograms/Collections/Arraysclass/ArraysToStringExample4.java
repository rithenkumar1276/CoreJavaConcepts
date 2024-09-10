package com.evergent.CoreJava.Collections.Arraysclass;

import java.util.Arrays;
/*
 * Converting Array to String
The Arrays.toString() method returns a string representation of the contents of the specified array.
 */
public class ArraysToStringExample4 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Converting array to string
        String arrayString = Arrays.toString(fruits);

        System.out.println("Array as string: " + arrayString);
    }
}
