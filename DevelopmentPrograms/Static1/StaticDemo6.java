package com.evergent.CoreJava.static1;

public class StaticDemo6 {
	static String cname="Indian";
	int age=28;
	String adress="Hyderabad";
	public void display() {
		cname="welcome";
		System.out.println("Cname :"+cname);
		System.out.println("Age :"+age);
		System.out.println("Adress :"+adress);
	}
   public static void main(String[] args) {
	   StaticDemo6 obj1=new StaticDemo6();
	   System.out.println("first object Name :"+cname);
	   obj1.display();
	   //StaticDemo6 obj2=new StaticDemo6();
	   //System.out.print("Second object name :"+obj2.cname);
   }
}
