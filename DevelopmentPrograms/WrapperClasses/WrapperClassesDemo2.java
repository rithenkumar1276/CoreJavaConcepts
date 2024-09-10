package com.evergent.CoreJava.WrapperClasses;

public class WrapperClassesDemo2 {

	public static void main(String[] args) {
		int a1=10;
		double d1=799.45;
		byte b1=20;
		
		//auto boxing converting primitive data type to object
		Integer I1=new Integer(a1);
		System.out.println("int object value is :"+I1);
		//auto unboxing converting object to primitive data type
		int a2=I1.intValue();
		System.out.println("int value is : "+a2);
		
		
		//auto boxing converting primitive data type to object
		Double D1=new Double(d1);
		System.out.println("Double object value is :"+D1);
		//auto unboxing converting object to primitive data type
		double d2=D1.doubleValue();
		System.out.println("Double value is : "+d2);
		
		//auto boxing converting primitive data type to object
		Byte B1=new Byte(b1);
		System.out.println("Byte object value is :"+B1);
		//auto unboxing converting object to primitive data type
		byte b2=I1.byteValue();
		System.out.println("Byte value is : "+d2);

	}

}
