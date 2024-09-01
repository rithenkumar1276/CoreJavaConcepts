package com.evergent.CoreJava.static1;

public class StaticDemo5 {
	static String cname="Indian";
	static {
		System.out.println("Static Block is First");   //execution starts from static
	}
	static void mydata() {
		System.out.println("MyData");
	}
   public static void main(String[] args) {
	   System.out.println(cname);
	   mydata();
	   
   }
}
