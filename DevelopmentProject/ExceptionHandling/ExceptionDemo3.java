package com.evergent.CoreJava.ExceptionHandling;
/** 3 All Exception are executed while abnormal condition only
    4 Normal flow it won't execute any exeception **/ 
public class ExceptionDemo3 {
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
	}
	public static void main(String[] args) {
		ExceptionDemo3 ep2=new ExceptionDemo3();
		ep2.myData();
	}

}
