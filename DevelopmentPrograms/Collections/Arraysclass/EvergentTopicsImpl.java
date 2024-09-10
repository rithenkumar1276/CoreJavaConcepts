package com.evergent.CoreJava.Collections.Arraysclass;

import java.util.Arrays;
import java.util.List;

public class EvergentTopicsImpl {
	
	public static void main(String[] args) {
		
	 
	List topics=Arrays.asList(new EvergentTopics("Encapsulation :","Inheritance :"," : OOPS"),
            new EvergentTopics("CheckedException :","UnCheckedException :"," ExceptonsHandling"),
            new EvergentTopics("SET","LIST","Collection"));
	
	System.out.println(topics);
	
	  List mydata=Arrays.asList(10,20,30);
	  System.out.println(mydata);
	  
	}

}
