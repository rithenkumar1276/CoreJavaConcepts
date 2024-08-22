package com.evergent.CoreJava.final1;
 //final class Myclasses{                //Final class Cannot inherited
 // final public void myproduct() {
 //	    System.out.println("All Products");
 //    }
 // }
public class FinalDemo3{
	final String Cname="India";
	public void mydata() {
		System.out.println("Name is :"+Cname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo3 obj=new FinalDemo3();
		obj.mydata();
		System.out.println("cName is :"+obj.Cname);
	}

}
