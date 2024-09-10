package com.evergent.CoreJava.Collections.comparator;

/*
 * 
 AgeComparator: Compares Student objects based on their age. 
 It uses Integer.compare() to avoid handling null cases manually.
NameComparator: Compares Student objects based on their name using 
String's compareTo() method.
 */

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}
 
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
 
