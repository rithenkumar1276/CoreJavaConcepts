package com.evergent.CoreJava.strings;
final class personimmutable{
	private final String name;
	private final int age;
	public personimmutable(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String myname() {
		return name;
	}
	public int age() {
		return age;
	}
}

public class MainPerson {
	public static void main(String[] args) {
    personimmutable obj=new personimmutable("Ram",20);
    System.out.println("The Name is :"+obj.myname());
    System.out.println("The age is :"+obj.age());
}
}
