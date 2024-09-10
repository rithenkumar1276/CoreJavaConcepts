package com.evergent.CoreJava.Comparable;

public class Student implements Comparable<Student> {
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
    // Implementing the compareTo method
    @Override
    public int compareTo(Student s) {
        // Compare by age
        return Integer.compare(this.age, s.age);
    }

    // toString method for printing Student details
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
