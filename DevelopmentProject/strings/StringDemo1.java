package com.evergent.CoreJava.strings;

public class StringDemo1 {
	public static void main(String[] args) {
	String s1=new String("Hello");
	String s2=new String("Hello");
	if(s1==s2) {
		System.out.println("Equal");
	}
	else {
		System.out.println("Not Equal");
	}
	if(s1.equals(s2)) {
		System.out.println("Equal");
	}

}
}
