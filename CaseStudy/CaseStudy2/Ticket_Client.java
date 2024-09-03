package com.evergent.CoreJava.Rithen.CaseStudy2;

import java.util.Scanner;
 
public class Ticket_Client {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TicketInterface ticket=new TicketImp();
		for(;;){
			System.out.println("\n 1.Add Ticket \n 2.Search by Ticket Id \n 3.processNextTicket  \n 4.peekNextTicket() \n 5.dispalyQueue \n 6. exit \n");
			int no=sc.nextInt();
			sc.nextLine();
			switch(no){
			case 1:int id=(int)(Math.random() * 900) + 100;
				   System.out.println("Enter the Name:");
				   String name=sc.nextLine();
				   System.out.println("Enter the Age :");
				   int age=sc.nextInt();
				   Ticket t=new Ticket();
				   t.setId(id);
				   t.setName(name);
				   t.setAge(age);
				   String message=ticket.addTicket(t);
				   System.out.println("Successfully  Id:"+message+" Added!");
				   break;
			case 2:System.out.println("Enter the Id:");
			   	   int id1=sc.nextInt();
			   	   ticket.searchByIdName(id1);
			   	   break;
			  			
			case 3:ticket.processNextTicket();
				break;
			case 4:ticket.peekNextTicket();
			break;
			case 5:ticket. dispalyQueue();
			break;
			case 6:System.exit(0);
			}
			
		}
	}
}
	


