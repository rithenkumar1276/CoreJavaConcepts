package com.evergent.CoreJava.constructors;

public class Example3 {
	String Name;
	String Adress;
	int age;
	Example3(){
		System.out.println("Default Constructor");
	}
	Example3(String Name,int age,String Adress){
		this.Name=Name;
		this.age=age;
		this.Adress=Adress;
	}
	public void display() {
		System.out.println("Name :"+Name);
		System.out.println("age :"+age);
		System.out.println("Adress :"+Adress);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example3();
		Example3 obj=new Example3("Rithen",21,"Hyderabad");
		obj.display();

	}

}
