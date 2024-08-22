package com.evergent.scr.Collections;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    TreeSet obj1=new TreeSet();
		obj1.add(10);
		obj1.add(5);
		obj1.add(20);
		obj1.add(15);
        System.out.println(obj1);
	Iterator i=obj1.iterator();
    while(i.hasNext()) {
    	System.out.println(i.next());
    }
}

}
