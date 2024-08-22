package com.evergent.CoreJava.oops;

public class Person {
	String name="Sandeep";
	int age=22;
	String adress="hyderabad";
	public void display() {
		System.out.println("name is :"+name);
		System.out.println("age is :"+age);
		System.out.println("Adress is :"+adress);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.display();

	}

}
