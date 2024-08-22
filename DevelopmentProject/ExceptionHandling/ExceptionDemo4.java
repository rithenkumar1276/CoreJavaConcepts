package com.evergent.CoreJava.ExceptionHandling;
/** 17 We Should follow exception Hierarchical **/ 
public class ExceptionDemo4 {
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
		catch(NullPointerException e) {
			System.out.println("I can Handle :"+e);
		}
		catch(ArithmeticException e) {
			System.out.println("I can Handle :"+e);
		}
		catch(Exception e) {
			System.out.println("I can Handle :"+e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo4 ep2=new ExceptionDemo4();
		ep2.myData();
	}

}
