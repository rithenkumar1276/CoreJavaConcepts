package com.evergent.CoreJava.static1;

public class StaticDemo4 {
	static String cname="Indian";
	String name="Ramesh";                    
	static void mydata() {
		System.out.println("MyData");
	}
	public void myshow() { 
		mydata();                   //Non static method can access static methods and static variable
		System.out.println(cname);
	}
   public static void main(String[] args) {
	   mydata();
	   System.out.println(cname);
	   StaticDemo4 obj =new StaticDemo4();
	   obj.myshow();
   }
}
