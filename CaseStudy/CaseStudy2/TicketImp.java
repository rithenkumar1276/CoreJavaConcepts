package com.evergent.CoreJava.Rithen.CaseStudy2;

import java.util.ArrayDeque;

public class TicketImp implements TicketInterface {
	ArrayDeque<Ticket> ticketlist=null;
	public TicketImp() {
		ticketlist=new ArrayDeque<Ticket>();
	}
	
	@Override
	public String addTicket(Ticket t) {
		ticketlist.add(t);
		int i=t.getId();
		String res=String.valueOf(i);
		return res;
	} 

	@Override
	public void searchByIdName(int id) {
		boolean b=false;
		if(ticketlist.size()>0 && ticketlist!=null){
			System.out.println("-------------------------");
			for(Ticket f:ticketlist){
				if(f.getId()==id){
						System.out.println("Ticket Id :"+f.getId()+"\n"+"Person Name : "+f.getName()+"\n"+"Person age :"+f.getAge());
						System.out.println("-------------------------");
					b=true;
					break;	
				}
			}
		}
		if(!b)
			System.out.println("The Ticket is not found");
			
	}

	@Override
	public void  processNextTicket() {
			if(ticketlist.size()>0){
				System.out.println("The Ticket Processed :");
				Ticket td=ticketlist.poll();
				System.out.println("-------------------------");
				System.out.println("Ticket Id :"+td.getId()+"\n"+"Person Name : "+td.getName()+"\n"+"Person age :"+td.getAge());
				System.out.println("-------------------------");
			    
			}else{
				System.out.println("No Tickets to process Next.....");
			}
	}
	
	public void  peekNextTicket(){
		if(ticketlist.size()>0){
			System.out.println("The Peek Ticket  :");
			Ticket tp=ticketlist.peek();
			System.out.println("-------------------------");
			System.out.println("Ticket Id :"+tp.getId()+"\n"+"Person Name : "+tp.getName()+"\n"+"Person age :"+tp.getAge());
		    
		}else{
			System.out.println("No Tickets to Show.....");
		}
}
	public void dispalyQueue(){
		if(ticketlist.size()>0 && ticketlist!=null){
			System.out.println("The Total Available Tickets are :");
			System.out.println("-------------------------");
			for(Ticket f:ticketlist){
						System.out.println("Ticket Id :"+f.getId()+"\n"+"Person Name : "+f.getName()+"\n"+"Person age :"+f.getAge());
						System.out.println("-------------------------");
			}
		}
		else {
			System.out.println("_____No Ticket was Added....Please add ticket to display_____");
		}
	}
			
	}
	

