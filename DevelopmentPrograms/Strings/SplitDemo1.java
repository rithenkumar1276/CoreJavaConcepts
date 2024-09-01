package com.evergent.CoreJava.strings;

public class SplitDemo1 {
	public static void main(String[] args) {
	String s1="Java is a programming language";
	String[] s2=s1.split(" ");    //split is used to split the sentence by specific condition 
	for(int i=0;i<s2.length;i++) {
		System.out.println(s2[i]);
	}

}
}
