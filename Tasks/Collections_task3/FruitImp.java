package com.evergent.CoreJava.Collections_task3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FruitImp implements Fruit_martInterface {
	Set<Fruit> fruitSet=null;
	public FruitImp() {
		fruitSet=new LinkedHashSet<Fruit>();
	}
	
	@Override
	public String addFruit(Fruit b) {
		fruitSet.add(b);
		return b.getFname();
	} 

	@Override
	public void searchByFruitName(String sname) {
		boolean b=false;
		if(fruitSet.size()>0 && fruitSet!=null){
			System.out.println("-------------------------");
			for(Fruit f:fruitSet){
				if(f.getFname().equals(sname)){
					if(f.getFname().equals("mango")) {
						System.out.println("Fruit Name :"+f.getFname()+"\n"+"Number of "+f.getFname()+"es"+ " are :"+ f.getTotal()+"\n"+"Total Price :"+f.getPrice());
						System.out.println("-------------------------");
					}
					else {
					System.out.println("Fruit Name :"+f.getFname()+"\n"+"Number of "+f.getFname()+"s"+ " are :"+ f.getTotal()+"\n"+"Total Price :"+f.getPrice());
					System.out.println("-------------------------");
					}
					b=true;
					break;	
				}
			}
		}
		if(!b)
			System.out.println("The Fruit is not found");
			
	}

	@Override
	public void  displayAllFruits() {
			if(fruitSet.size()>0){
				System.out.println("-------------------------");
				for(Fruit f:fruitSet){
					if(f.getFname().equals("mango")) {
						System.out.println("Fruit Name :"+f.getFname()+"\n"+"Number of "+f.getFname()+"es"+ " are :"+ f.getTotal()+"\n"+"Total Price :"+f.getPrice());
						System.out.println("-------------------------");
					}
					else {
					System.out.println("Fruit Name :"+f.getFname()+"\n"+"Number of "+f.getFname()+"s"+ " are :"+ f.getTotal()+"\n"+"Total Price :"+f.getPrice());
					System.out.println("-------------------------");
					}
				}
					
			}else{
				System.out.println("No Fruits are available");
			}
	}
	public void removeFruit(String sname) {
		boolean b=false;
		if(fruitSet.size()>0 && fruitSet!=null){
			for(Fruit f:fruitSet){
				if(f.getFname().equals(sname)){
					fruitSet.remove(f);	
					b=true;
					System.out.println(f.getFname()+ " Was Removed from List.");
					break;	
				}
			}
		}
		if(!b)
			System.out.println("The Fruit is not found");
			
	}

}

