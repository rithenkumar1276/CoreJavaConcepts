package com.evergent.CoreJava.strings;

public class StringReverse {
	public static void main(String[] args) {
	String str="Hello";
	StringBuilder rev=new StringBuilder(str).reverse();
	System.out.println("String after reverse : "+rev);
}
}
