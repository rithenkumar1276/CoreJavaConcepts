package com.evergent.CoreJava.Collections.Map;
import java.util.Hashtable;

public class HashtableDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable mymap=new Hashtable();
		mymap.put(100, "krishna");
		mymap.put(200, "rakesh");
		mymap.put(500, "Rakesh");
		mymap.put("900", "Rithen");
		mymap.put(100, "Sandepp");
		//mymap.put(null, "shashi"); //In hashtable null is consider as exception
		//mymap.put(100, null);
		System.out.println(mymap);

	}

}
