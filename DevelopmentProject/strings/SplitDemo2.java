package com.evergent.CoreJava.strings;

public class SplitDemo2 {
	public static void main(String[] args) {
	String s1="Java is a programming language";
	String[] s2=s1.split(" ");    //split is used to split the sentence by specific condition 
	for(String w:s2) {
		System.out.println(w);
	}

}
}
