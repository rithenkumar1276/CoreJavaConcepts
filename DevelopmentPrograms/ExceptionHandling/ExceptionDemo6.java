package com.evergent.CoreJava.ExceptionHandling;
/** 16 Try followed by either catch block or finally block **/ 
public class ExceptionDemo6 {
	String name="null";
	int k=2;
	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			int t=10/k;
			System.out.println(t);
			System.out.println("End");
		}
		finally {
			System.out.println("Finally Block for closing DP/Network Connection");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo6 ep2=new ExceptionDemo6();
		ep2.myData();
	}

}
