package com.evergent.CoreJava.ExceptionHandling;
/** 14 Throws an exception will be executed method by method **/ 
public class ExceptionDemo7 {
	String name=null;
	public void myData() throws NullPointerException  {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("End");
		
	}
	public static void main(String[] args) {
		try {
		ExceptionDemo7 ep2=new ExceptionDemo7();
		ep2.myData();
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}

}
