package com.evergent.CoreJava.oops;

public class SingleInheritance extends Calculation {
	public void myshow() {
		System.out.println("Local method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritance obj=new SingleInheritance();
		obj.myshow();
		obj.add();

	}

}
