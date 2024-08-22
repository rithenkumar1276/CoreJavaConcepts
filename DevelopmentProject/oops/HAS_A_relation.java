package com.evergent.CoreJava.oops;

public class HAS_A_relation {

		public void myshow() {
			System.out.println("Local method");
		}

		public static void main(String[] args) {
			HAS_A_relation obj=new  HAS_A_relation();
			obj.myshow();
			Person obj2=new Person();
			obj2.display();

		}

}


