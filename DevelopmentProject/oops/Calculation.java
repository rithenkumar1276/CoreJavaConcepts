package com.evergent.CoreJava.oops;

public class Calculation {
	int a=10,b=20;
	public void add() {
		System.out.println("Addition is = "+ (a+b));
	}
	public void Multiply() {
		System.out.println("Multiply is = "+a*b);
	}
	public void Divide() {
		System.out.println("Division is = "+a/b);
	}
	public void Modulo() {
		System.out.println("Modulo is = "+a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal=new Calculation();
		cal.add();
		cal.Multiply();
		cal.Divide();
		cal.Modulo();
	}

}
