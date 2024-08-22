package com.evergent.CoreJava.final1;
 class myclass{
	 final public void myproduct() {
		 System.out.println("All Products");
	 }
 }
public class FinalDemo2 extends myclass{
	final String Cname="India";
	// public void myproduct() {               //Cannot override the final method from myclass
	//	 System.out.println("All Products");
	//}
	public void mydata() {
		System.out.println("Name is :"+Cname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo2 obj=new FinalDemo2();
		obj.mydata();
		System.out.println("cName is :"+obj.Cname);
	}

}
