package com.evergent.CoreJava.Collections.comparator;

public class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
  
    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method for printing Student details
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
