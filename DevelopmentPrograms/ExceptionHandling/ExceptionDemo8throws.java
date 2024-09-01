package com.evergent.CoreJava.ExceptionHandling;
/** 14 Throws an exception will be executed method by method **/ 
public class ExceptionDemo8throws{
	String name=null;
	public void myData() throws NullPointerException  {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("End");
		
	}
	public void myInfo() throws NullPointerException {
		myData();
		System.out.println("My Info Method");
	}
	public static void main(String[] args) {
		try {
		ExceptionDemo8throws ep2=new ExceptionDemo8throws();
		ep2.myInfo();
		}
		catch(Exception e) {
			System.err.println("I can Handle "+e);
		}
	}

}
