package com.evergent.CoreJava.constructors;

public class Example2 {
	String Name;
	String Adress;
	int age;
	Example2(){
		System.out.println("Default Constructor");
	}
	Example2(String Name1,int age1,String Adress1){
		Name=Name1;
		age=age1;
		Adress=Adress1;
	}
	public void display() {
		System.out.println("Name :"+Name);
		System.out.println("age :"+age);
		System.out.println("Adress :"+Adress);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example2();
		Example2 obj=new Example2("Rithen",21,"Hyderabad");
		obj.display();

	}

}
