package com.evergent.CoreJava.Collections.Arraysclass;

import java.util.Arrays;
//The Arrays.fill() method assigns the specified value to each element of the specified array.
public class ArraysFill2 {
  public static void main(String[] args) {
      int[] numbers = new int[5];

      // Filling the array with a specific value
      Arrays.fill(numbers, 7);

      System.out.println("Filled array: " + Arrays.toString(numbers));
  }
}
