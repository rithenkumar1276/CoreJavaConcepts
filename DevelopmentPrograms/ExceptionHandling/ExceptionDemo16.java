package com.evergent.CoreJava.ExceptionHandling;
// StackOverFlowException

public class ExceptionDemo16 {
	public static void recuriveMethod() {
		recuriveMethod();
	}
	public static void main(String[] args) {
		try {
			recuriveMethod();
			}
		catch(StackOverflowError e) {
			System.out.println(e);
		}
	
}
}