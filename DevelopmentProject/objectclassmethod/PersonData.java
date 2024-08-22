package com.evergent.CoreJava.objectclassmethod;

class person1{
	String name;
	int age;
	public person1(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+age;
	}
}

public class PersonData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person1 obj=new person1("Sandeep",23);
		System.out.println("The name and age is : "+obj);  //we are calling the direct object

	}

}
