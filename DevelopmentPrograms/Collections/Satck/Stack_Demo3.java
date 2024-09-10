package com.evergent.CoreJava.Collections.Satck;
import java.util.Stack;

public class Stack_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack obj=new Stack();
		obj.push("red");
		obj.push("Black");
		obj.push("white");
		System.out.println("The Search  Elements of White is are :"+obj.search("white"));
		System.out.println("The Element are :"+obj);
	}

}
