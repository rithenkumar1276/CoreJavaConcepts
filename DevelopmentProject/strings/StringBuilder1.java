package com.evergent.CoreJava.strings;

public class StringBuilder1 {
	public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Hello");
	System.out.println("inital String"+sb);
	//Append ind value at last
	sb.append(" World!");
	System.out.println("After Append :"+sb);
	//Inserting Value At Specific Position
	sb.insert(6, "Beautiful");
	System.out.println("After Inserted :"+sb);
	//Replacing element in Specify position
	sb.replace(0, 5, "hi");
	System.out.println("After Replacing :"+sb);
	//Deleting Value in sb
	sb.delete(0, 3);
	System.out.println("After Deleting :"+sb);
	//Revering the string using reverse function
	sb.reverse();
	System.out.println("After Reverse :"+sb);
	System.out.println("StringBuilder Capacity : "+sb.capacity());
	System.out.println("StringBuilder Length : "+sb.length());
}
}
