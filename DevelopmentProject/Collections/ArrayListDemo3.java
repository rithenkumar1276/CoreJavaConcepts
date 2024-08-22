package com.evergent.scr.Collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj=new ArrayList();
		obj.add(100);
		obj.add("Rithen");
		obj.add(20.3);
		obj.add(100);
        System.out.println(obj);
        Iterator i=obj.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
        
	}

}
