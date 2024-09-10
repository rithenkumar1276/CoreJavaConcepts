package com.evergent.CoreJava.WrapperClasses;

public class WrapperClassesDemo3 {

	public static void main(String[] args) {
		int a1=10;
		char c1='r';
		
		//auto boxing converting primitive data type to object
		Integer I1=new Integer(a1);
		System.out.println("Integer object value is :"+I1);
		//auto unboxing converting object to primitive data type
		int a2=I1.intValue();
		System.out.println("int value is : "+a2);
		
		//auto boxing converting char primitive data type to Character object
		Character C1=new Character(c1);
		System.out.println("character object value is :"+C1);
		//auto unboxing converting Character object to char data type
		char c2=C1.charValue();
		System.out.println("char value is :"+c2);
		
	}

}
