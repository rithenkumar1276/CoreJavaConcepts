package com.evergent.CoreJava.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        // Creating a list of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ramu", 22));
        students.add(new Student("Balu", 18));
        students.add(new Student("Surya", 23));
        students.add(new Student("Mohan", 20));
  
        // Display the original list
        System.out.println("Before Sort List:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting the list of students using their natural ordering (by age)
        Collections.sort(students);

        // Display the sorted list
        System.out.println("\nAfter Sorted by Age:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
