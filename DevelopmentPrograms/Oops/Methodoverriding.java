package com.evergent.CoreJava.oops;

class Vehicle{  
	  //defining a method  
	  void run(){
		  System.out.println("Vehicle is running");
		  }  
	}  
	//Creating a child class  
	class Methodoverriding extends Vehicle{  
	  //defining the same method as in the parent class  
	  void run(){
		  System.out.println("Bike is running safely");
		  }  
	  
	  public static void main(String args[]){  
	  Methodoverriding obj = new Methodoverriding();//creating object  
	  obj.run();//calling method  
	  }  
	} 