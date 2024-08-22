package com.evergent.CoreJava.ExceptionHandling;
/** 3 All Exception are executed while abnormal condition only
    4 Normal flow it won't execute any exeception **/ 
public class ExceptionDemo2 {
	String name="null";
	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("End");
		}
		catch(NullPointerException e) {
			System.out.println("I can Handle :"+e);
		}
	}


	public static void main(String[] args) {
		ExceptionDemo2 ep2=new ExceptionDemo2();
		ep2.myData();
	}

}
