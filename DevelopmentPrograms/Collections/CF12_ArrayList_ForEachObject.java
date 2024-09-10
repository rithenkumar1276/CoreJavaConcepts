package com.evergent.CoreJava.Collections;

import java.util.ArrayList;
public class CF12_ArrayList_ForEachObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> obj=new ArrayList<>();
		obj.add(100);
		obj.add("Rithen");
		obj.add(20.3);
		obj.add(100);
		//Used for each loop to iterate
		for(Object ob:obj) {
        System.out.println(ob);
		}
	}

}

