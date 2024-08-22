package com.evergent.CoreJava.static1;

public class StaticDemo3 {
	static String cname="Indian";
	String name="Ramesh";                    
	static void mydata() {
		//myshow()             //Error :Cannot make a static reference to the non-static method show()
		System.out.println("MyData");
	}
	public void myshow() {                    
		System.out.println("This is an non static method");
	}
   public static void main(String[] args) {
	   mydata();
	   System.out.println(cname);
   }
}
