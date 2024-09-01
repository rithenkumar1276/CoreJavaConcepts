package com.evergent.CoreJava.constructors;

   class MyExample {
	String Name;
	public MyExample() {
		System.out.println("hii");
	}
	public MyExample(String Name) {
		System.out.println("Name :"+Name);
	}
   }
   public class Example6 extends MyExample{
	String Name;
	String Adress;
	int age;
//	Example6(){
//		System.out.println("Default Constructor");
//	}
	Example6(String Name,int age,String Adress){
		super(Name);
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
//		new Example6();
		Example6 obj=new Example6("Rithen",21,"Hyderabad");
		obj.display();

	}

}
