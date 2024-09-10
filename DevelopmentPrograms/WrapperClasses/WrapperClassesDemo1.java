package com.evergent.CoreJava.WrapperClasses;

public class WrapperClassesDemo1 {

	public static void main(String[] args) {
		int a1=10;
		//auto boxing converting primitive data type to object
		Integer I1=new Integer(a1);
		System.out.println("object value :"+I1);
		//auto unboxing converting object to primitive data type
		int a2=I1.intValue();
		System.out.println("int value: "+ a2);

	}

}
