package com.evergent.CoreJava.ExceptionHandling;
/** 13 Finally is block , if exception is occurs or 
 * else finally block will be executed **/ 
public class ExceptionDemo5 {
	String name="null";
	int k=0;
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
		finally {
			System.out.println("Finally Block for closing DP/Network Connection");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo5 ep2=new ExceptionDemo5();
		ep2.myData();
	}

}
