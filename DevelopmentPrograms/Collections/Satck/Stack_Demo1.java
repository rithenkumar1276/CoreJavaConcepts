package com.evergent.CoreJava.Collections.Satck;
import java.util.Stack;

public class Stack_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack obj=new Stack();
		obj.push("red");
		obj.push("Black");
		obj.push("white");
		System.out.println("The Element are :"+obj);
		obj.pop();
		System.out.println("The Elements after removing :"+obj);

	}

}
