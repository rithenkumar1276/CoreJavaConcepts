package com.evergent.CoreJava.interfaces1;

public class BookImpl1 implements Book {
	
	public void bookTitle() {
		System.out.println("Core Java");
	}
	public void bookAuthor() {
		System.out.println("James");
	}
	public void bookPrice() {
		System.out.println("RS230");
	}
	public void show() {
		System.out.println("Show is a local variable");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookImpl1 obj=new BookImpl1();
		obj.bookTitle();
		obj.bookAuthor();
		obj.bookPrice();

	}

}
