package com.evergent.CoreJava.Collections.Arraysclass;

import java.util.Arrays;

public class ArraysSort1 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 9, 2, 4, 7, 6};

        // Display the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sorting the array in ascending order
        Arrays.sort(numbers);

        // Display the sorted array
        System.out.println("Sorted array (ascending order): " + Arrays.toString(numbers));
    }
}
