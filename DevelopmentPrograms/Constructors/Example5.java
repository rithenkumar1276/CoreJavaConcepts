package com.evergent.CoreJava.constructors;

public class Example5 {
	String Name;
	String Adress;
	int age;
	Example5(){
		System.out.println("Default Constructor");
	}
	Example5(String Name){
		this.Name=Name;
	}
	Example5(String Name,int age,String Adress){
		this(Name);
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
		new Example5();
		Example5 obj=new Example5("Rithen",21,"Hyderabad");
		obj.display();

	}

}
