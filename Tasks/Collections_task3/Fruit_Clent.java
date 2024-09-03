package com.evergent.CoreJava.Collections_task3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Fruit_Clent {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Fruit_martInterface fruit=new FruitImp();
		for(;;){
			System.out.println("\n 1.Add Fruit \n 2.Search by Fruit Name \n 3.displayAllFruits  \n 4.RemoveFruit \n 5. exit \n");
			int no=sc.nextInt();
			switch(no){
			case 1:System.out.println("Enter the Fruit Name :");
				   String fname=sc.next();
				   System.out.println("Enter the price");
				   int price=sc.nextInt();
				   System.out.println("Enter the Number of fruits want to buy :");
				   int total=sc.nextInt();
				   Fruit b=new Fruit();
				   b.setFname(fname);
				   price=price*total;
				   b.setPrice(price);
				   b.setTotal(total);
				   String message=fruit.addFruit(b);
				   System.out.println("Successfully "+message+" Added!");
				   break;
			case 2:System.out.println("Enter the fruit Name :");
			   	   String sname=sc.next();
			   	   fruit.searchByFruitName(sname);
			   	   break;
			  			
			case 3:fruit.displayAllFruits();
				break;
			case 4:System.out.println("Enter the fruit Name to delete :");
			       String rname=sc.next();
		   	       fruit.removeFruit(rname);
		   	       break;
			case 5:System.exit(0);
			}
			
		}
	}
}
	


