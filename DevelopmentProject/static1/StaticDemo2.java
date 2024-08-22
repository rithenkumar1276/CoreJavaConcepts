package com.evergent.CoreJava.static1;

public class StaticDemo2 {
	static String cname="Indian";
	String name="Ramesh";                    //we can't access non static in main
	static void mydata() {
		System.out.println("MyData");
	}
	public void myshow() {                    //we can't access non static in main
		System.out.println("This is an non static method");
	}
   public static void main(String[] args) {
	   mydata();
	   System.out.println(cname);
   }
}
