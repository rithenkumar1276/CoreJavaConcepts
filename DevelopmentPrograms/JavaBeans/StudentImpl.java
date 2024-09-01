package com.evergent.CoreJava.JavaBeans;

public class StudentImpl {

	public static void main(String[] args) {
		StudentBeans stu = new StudentBeans();
		stu.setSno(100);
		stu.setSname("Ram");
		stu.setAddress("hyderabad");
		
		System.out.println(stu);
	}
}