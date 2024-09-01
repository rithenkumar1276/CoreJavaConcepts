package com.evergent.CoreJava.objectclassmethod;

final class person2{
	String value;
	public person2(String value) {
		this.value=value;
	}
	public String myvalue() {
		return value;
	}
	public String toString() {
		return value;
	}
}

public class Immutableobj1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person2 obj=new person2("Sandeep");
		System.out.println("The name and age is : "+obj);  //we are calling the direct object
		System.out.println("The name and age is : "+obj.myvalue()); 
	}

}
