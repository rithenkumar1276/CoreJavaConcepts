package com.evergent.CoreJava.constructors;
  
	class car{
		String Color;
		int speed;
		car(){
			Color="White";
			speed=120;
		}
		car(String Color,int speed){
			this.Color=Color;
			this.speed=speed;
		}
		void display(){
			System.out.println("Color :"+Color);
			System.out.println("Speed :"+speed);
		}
	}

   public class Example7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car c1=new car();
		car c2=new car("Blue",100);
		c1.display();
		c2.display();

	}

}
