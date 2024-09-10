package com.evergent.CoreJava.WrapperClasses;
import java.util.ArrayList;

public class WrapperClassesDemo4_ArrayList {

	public static void main(String[] args) {
		int a1=10;
		
		//auto boxing converting primitive data type to object
		Integer I1=new Integer(a1);
		ArrayList arr=new ArrayList();
		arr.add(I1);
		System.out.println(arr);
		Integer I2=new Integer(100);
		arr.add(I2);
		System.out.println(arr);
		arr.add(new Integer(200));
		System.out.println(arr);
		System.out.println(arr.get(1));
		
		//JDK 1.5
		ArrayList arr1=new ArrayList();
		//The compiler will automatically do boxing and unboxing
		arr1.add(500);
		arr1.add("Rithen");
		System.out.println(arr1);
	}
}
