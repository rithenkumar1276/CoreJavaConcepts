package com.evergent.CoreJava.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class CF11_Hashset_Generics {
	public static void main(String[] args) {
		
		HashSet<Integer> myList = new HashSet<>();
		myList.add(100);
		myList.add(59);
		myList.add(10);
		myList.add(300);
		
		System.out.println(myList);
		
		Iterator i = myList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(Integer w:myList) {
			System.out.println(w);
		}
	}
}
