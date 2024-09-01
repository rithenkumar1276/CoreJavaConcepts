package com.evergent.CoreJava.oops;

public class Methodflow {
	//No Parameter No Return type
	public void show() {
		System.out.println("NO parameter and no return type");
	}
	//No Parameter With return type
	public int myadd() {
		return 10+20;
	}
	//with parameter no return type
	public void mymul(int a,int b) {
		System.out.println("Multiply of a and b is :"+(a*b));
	}
	//with parameter and with return type
	public int myprint(int a) {
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodflow mf=new Methodflow();
		mf.show();
		System.out.println(mf.myadd());
		mf.mymul(10,10);
		System.out.println(mf.myprint(10000));
		

	}

}
