package com.evergent.CoreJava.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet obj1=new HashSet();
		obj1.add(100);
		obj1.add("Rithen");
		obj1.add(20.3);
		obj1.add(100);
        System.out.println(obj1);
	Iterator i=obj1.iterator();
    while(i.hasNext()) {
    	System.out.println(i.next());
    }
}

}