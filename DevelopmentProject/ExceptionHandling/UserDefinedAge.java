package com.evergent.CoreJava.ExceptionHandling;
class AgeNotSupportException extends Exception{
	public AgeNotSupportException(String in) {
		System.out.println(in);
	}
}

public class UserDefinedAge{
	int age=10;
	public void myData() throws Exception  {
		if(age>18) {
			System.out.println("Eligible for Vote");
		}
		else {
				throw new AgeNotSupportException("Not Eligible for Vote");
			}
		
	}
	public static void main(String[] args) {
		try {
		UserDefinedAge ep2=new UserDefinedAge();
		ep2.myData();
		}
		catch(Exception e) {
			System.out.println("I can Handle "+e);
		}
	}

}
