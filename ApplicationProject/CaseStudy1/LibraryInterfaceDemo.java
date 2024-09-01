package com.evergent.CoreJava.ram.CaseStudy1;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		try {
			KidUser kid = new KidUser();
			kid.registerAccount(11);
			kid.requestBook("Kids");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			AdultUser adult = new AdultUser();
			adult.registerAccount(13);
			adult.requestBook("Fiction");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}