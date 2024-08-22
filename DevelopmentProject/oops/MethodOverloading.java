package com.evergent.CoreJava.oops;

public class MethodOverloading {
	public void add(int a,int b) {
		System.out.println("Addition of two numbers is :"+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("Addition of three numbers is :"+(a+b+c));
	}
	public void add(int a,float b) {
		System.out.println("Addition of int and float numbers is :"+(a+b));
	}
	public void add(float a,int b) {
		System.out.println("Addition of float and int numbers is :"+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.add(10, 20, 300);
		obj.add(88f, 200);
		obj.add(30, 4f);
		obj.add(1, 2);

	}

}
