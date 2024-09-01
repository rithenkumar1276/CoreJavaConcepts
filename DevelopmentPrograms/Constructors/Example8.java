package com.evergent.CoreJava.constructors;
  
	class animal{
		private String name;
		private int age;
		public animal(String name,int age){
			this.name=name;
			this.age=age;
		}
		public void displayinfo() {
			System.out.println("Name : "+name);
			System.out.println("age :"+age);
		}
	}
	class Dog extends animal{
		String Breed;
		Dog(String name,int age,String Breed){
			super(name,age);
			this.Breed=Breed;
		}
		public void displayinfo() {
			super.displayinfo();
			System.out.println("Breed :"+Breed);
		}
	}
	public class Example8{
		public static void main(String[] args) {
			Dog obj=new Dog("Puppy",21,"goldbreed");
			obj.displayinfo();
		}
	}
	