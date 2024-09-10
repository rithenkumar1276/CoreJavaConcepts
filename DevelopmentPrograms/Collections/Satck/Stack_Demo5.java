package com.evergent.CoreJava.Collections.Satck;

import java.util.Collections;
import java.util.Stack;
public class Stack_Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> obj=new Stack<>();
		obj.push("Apple");
		obj.push("Banana");
		obj.push("Chery");
		obj.push("Date");
		System.out.println(obj);
		String top=obj.peek();
		System.out.println(top);
		String RE=obj.pop();
		System.out.println(RE);
		System.out.println("Stack After Pop "+obj);
		boolean b=obj.isEmpty();
		System.out.println(b);
		int pos=obj.search("Banana");
		System.out.println(pos);
		if(pos!=-1) {
			System.out.println(pos);
		}else {
			System.out.println("Banana is not in stack");
		}
		obj.clear();
		System.out.println(obj);

	}

}
