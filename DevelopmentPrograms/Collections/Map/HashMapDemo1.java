package com.evergent.CoreJava.Collections.Map;
import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap mymap=new HashMap();
		mymap.put(100, "Ramesh");
		mymap.put(200, "Ram");
		mymap.put(700, "Rakesh");
		mymap.put("800", "Rithen");
		mymap.put(100, "Sandepp");
		mymap.put(null, "shashi");
		mymap.put(100, null);
		System.out.println(mymap);

	}

}
