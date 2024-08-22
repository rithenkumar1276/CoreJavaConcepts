package com.evergent.CoreJava.Rithen.Application2;

import java.util.*;
public class MindCareSystem {
	
    enum module1 {S,P,R,SD,E};
    enum MindIssue {M, D, ST, O ,MM}
    enum PaymentOption {TP, MP ,MM}
    enum ReportOption {IO, SU, MM}
    enum doctorlist {A,B,C,D,E,F,G}
    
    static String sessionType;
    static int sessionCost;
    static int totalAmount;
    static int sessionDays;
    static int discountedAmount;
    static String issue;
    static String module;
    static String selectedDoctor;
    static int Discount1;
    
    public static void main(String[] args) {
    	 Scanner br =new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to MindCare System");
            System.out.println("================================");
            System.out.println(" MCS Menu");
            System.out.println("S-Select Mind Issue:");
    		System.out.println("P-Payment Module");
    		System.out.println("R-Report Module");
    		System.out.println("SD-Show Discounts");
    		System.out.println("E-Quit Module");
    		System.out.println("======================");
    	    System.out.println("Enter your Module code (S,P,R,SD,E) : ");


            
            System.out.println("You entered module is  : " );
            module=br.nextLine();
            switch(module1.valueOf(module))
            {
            case S:
            	System.out.println(" Select Mind Issue");
            	System.out.println("======================");
            	System.out.println("M-Motivation");
            	System.out.println("O-Overthinking");
            	System.out.println("D-Depression");
            	System.out.println("ST-Stress Relif");
            	System.out.println("MM-Return to Main Menu");
            	System.out.println("======================");
            	System.out.println("Enter your Module code (M, D, ST, O ,MM) : ");
            	module=br.nextLine();
            		switch(MindIssue.valueOf(module))
            		{

            		case M:
            			issue="Motivation";
            			DoctorList();
            			break;
            		case O:
            			issue="Overthinking";
            			DoctorList();
            			break;
            		case D:
            			issue="Depression";
            			DoctorList();
            			break;
            		case ST:
            			issue="Stress Relif";
            			DoctorList();
            			break;
            		case MM:
            			System.out.println("Returning to Main Menu");
            			break;
              }
            		break;
            case P:
            	System.out.println(" Payment Module");
            	System.out.println("======================");
            	System.out.println("TP-To Show Total Bill To Pay");
            	System.out.println("MP-To make payment");
            	System.out.println("MM-Return to Main Menu");
            	System.out.println("======================");
            	System.out.println("Enter your Module code (TP,MP,MM) : ");

            	module=br.nextLine();
            	switch(PaymentOption.valueOf(module))
            	{
            	case TP:
            		System.out.println("Total Amount to be Paid : Rs"+discountedAmount);
            		break;
            	case MP:
            		System.out.println("Payment of Rs "+discountedAmount+"made successfully.");
            		break;
            	case MM:
        			System.out.println("Returning to Main Menu");
        			break;
            	}
            	break;
            case R:
            	System.out.println(" Payment Module");
            	System.out.println("======================");
            	System.out.println("IO-to dispaly invoice for order mode");
            	System.out.println("SU-to display the summary of orders and payments made");
            	System.out.println("MM-Return to Main Menu");
            	System.out.println("======================");
            	System.out.println("Enter your Module code (IO,SU,MM) : ");

            	module=br.nextLine();
            	switch(ReportOption.valueOf(module))
            	{

            	case IO:
            		System.out.println("Invoice Display");
            		System.out.println("==================");
            		System.out.println("Ordered Id : " +(Math.ceil(Math.random())));
            		System.out.println("Number of days selected "+sessionDays+"Days");
            		System.out.println("To Make Payment : Rs"+(discountedAmount));

            		break;
            	case SU:
            		System.out.println("MindCare Session Summary:");
            		System.out.println("======================");
                    System.out.println("Issue= " + issue);
                    System.out.println("Doctor Name= " + selectedDoctor);
                    System.out.println("Session Type= " + sessionType);
                    System.out.println("Total Days= " + sessionDays+"Days");
                    System.out.println("Discount ="+Discount1+"%");
                    System.out.println("========================================");
            		System.out.println("Total Amount After Discount to be Paid = Rs"+(discountedAmount)+"/-");

            		break;	
            	case MM:
        			System.out.println("Returning to Main Menu");
        			break;
            	}
            	break;
            case SD:
            	System.out.println(" SDiscount Schedule");
            	System.out.println("======================");
            	System.out.println("1-5 Days   = 0%");
            	System.out.println("5-9 Days   = 2%");
            	System.out.println("10-19 Days = 5%");
            	System.out.println("20-30 Days = 8%");
            	System.out.println("more than 30 Days = 10%");
            	break;
            case E:
            	System.out.println("Quit Module");
            	System.out.println("Thank You!..........And Don't Come Again");
            	br.close();
            	System.exit(0);
            	break;		
    		}    		
    	}
    }
    public static void calculation(int sessionCost) {
    	
    	 Scanner br2 =new Scanner(System.in);
    	 System.out.println("Enter the number of days you want to book:");
         sessionDays = br2.nextInt();
         totalAmount = sessionCost * sessionDays;
         System.out.println("Total Amount = Rs " + totalAmount+"/-");
         discountedAmount = totalAmount;
         if (sessionDays >=5 && sessionDays <=9) {
             discountedAmount = (int) (totalAmount-(totalAmount*0.02)); 
             Discount1=2;
             System.out.println("Discount = 2% ");
         }
         else if(sessionDays >=10 && sessionDays<=19) {
        	 discountedAmount = (int) (totalAmount-(totalAmount*0.05));
        	 Discount1=5;
        	 System.out.println("Discount = 5% ");
         }
         else if(sessionDays >=20 && sessionDays<=30) {
        	 discountedAmount = (int) (totalAmount-(totalAmount*0.08));
        	 Discount1=8;
        	 System.out.println("Discount = 8% ");
         }
         else if(sessionDays >30) {
        	 discountedAmount = (int) (totalAmount-(totalAmount*0.10));
        	 Discount1=10;
        	 System.out.println("Discount = 10% ");
         }
         System.out.println("======================================");
         System.out.println("Total Amount after discount= Rs " + discountedAmount+"/-");
        
    }
    
    
    private static void DoctorList() {
    	
    	Scanner br3=new Scanner(System.in);
    	String on="online",of="offline";
    	String ph="phonecall";
    	System.out.println("     Total Available Doctors   ");
		System.out.println("===============================================");
		System.out.println("A \t Name :DR.Neha \n \t Profession :Ph.D. in Positive Psychology \n\t Experience : 5 Years \n\t Ratings : ****/***** \n\t Languages Known : Telugu,English  \n\t Counselor For :Motivation, Stress Relif \n\t Schedule Online Session Per One Day RS=100/- \n\t Schedule Offline Session Per One Day RS=150/- \n\t Schedule Call Session Per One Day RS=60/-");
		System.out.println("");
		System.out.println("B \t Name :DR.Ravi \n \t Profession :Ph.D. in Positive Psychology \n\t Experience : 9 Years \n\t Ratings : ****/***** \n\t Languages Known : Hindi,English  \n\t Counselor For :Motivation, Stress Relif \n\t Schedule Online Session Per One Day RS=100/- \n\t Schedule Offline Session Per One Day RS=180/-\n\t Schedule Call Session Per One Day RS=70/- ");
		System.out.println("");
		System.out.println("C \t Name :DR.Tom \n \t Profession :Ph.D. in Cognitive Behavioral therapy(CBT) \n\t Experience : 6 Years \n\t Ratings : ****/***** \n\t Languages Known : Telugu,English \n\t Counselor For :Depression, Overthinking \n\t Schedule Online Session Per One Day RS=100/- \n\t Schedule Offline Session Per One Day RS=250/-\n\t Schedule Call Session Per One Day RS=80/-");
		System.out.println("");
		System.out.println("D \t Name :DR.Arshad \n \t Profession :Ph.D. in Clinical Psychology \n\t Experience : 7 Years \n\t Ratings : ****/***** \n\t Languages Known : Hindi,English \n\t Counselor For :Depression,Overthinking \n\t Schedule Online Session Per One Day RS=110/- \n\t Schedule Offline Session Per One Day RS=250/- \n\t Schedule Call Session Per One Day RS=60/-");
		System.out.println("");
		System.out.println("E \t Name :DR.Jhon \n \t Profession :Ph.D. in Cognitive Behavioral therapy(CBT) \n\t Experience : 10 Years \n\t Ratings : ****/***** \n\t Languages Known : Telugu,English \n\t Counselor For :Stress relif,Overthinking  \n\t Schedule Online Session Per One Day RS=100/- \n\t Schedule Offline Session Per One Day RS=200/-\n\t Schedule Call Session Per One Day RS=80/- ");
		System.out.println("");
		System.out.println("F \t Name :DR.Meera \n \t Profession :Ph.D. in Behavioral Therapy \n\t Experience : 9 Years \n\t Ratings : *****/***** \n\t Languages Known : Hindi,English \n\t Counselor For :Depression,Stress Relif  \n\t Schedule Online Session Per One Day RS=110/- \n\t Schedule Offline Session Per One Day RS=280/-\n\t Schedule Call Session Per One Day RS=70/- ");
		System.out.println("");
		System.out.println("G \t Name :DR.Vikram \n \t Profession :Ph.D. in Psychiatric \n\t Experience : 12 Years \n\t Ratings : *****/***** \n\t Languages Known : Telugu,English  \n\t Counselor For :Overthiking,Stress Relif \n\t Schedule Online Session Per One Day RS=150/- \n\t Schedule Offline Session Per One Day RS=250/- \n\t Schedule Call Session Per One Day RS=65/-");
		System.out.println("===============================================");
		System.out.println("Select One Doctor For Schedule (A,B,C,D,E,F,G) : ");


		module=br3.nextLine();


		switch(doctorlist.valueOf(module))
		{

				case A:
					selectedDoctor="Dr.Neha";
					System.out.println("Enter Session in online OR offline OR phonecall :  ");
					sessionType=br3.nextLine();
					if(sessionType.equals(on)) {
						sessionCost=100;
					}
					else if(sessionType.equals(of)) {
						sessionCost=150;
					}else if(sessionType.equals(ph)) {
						sessionCost=60;
					}
					calculation(sessionCost);
					break;
				case B:
					selectedDoctor="Dr.Ravi";
					System.out.println("Enter Session in online OR offline OR phonecall :  ");
					sessionType=br3.nextLine();
					if(sessionType.equals(on)) {
						sessionCost=100;
					}
					else if(sessionType.equals(of)) {
						sessionCost=180;
					}
					else if(sessionType.equals(ph)) {
						sessionCost=70;
					}
					calculation(sessionCost);
					break;
				case C:
					selectedDoctor="Dr.Tom";
					System.out.println("Enter Session in online OR offline OR phonecall :  ");
					sessionType=br3.nextLine();
					if(sessionType.equals(on)) {
						sessionCost=100;
					}
					else if(sessionType.equals(of)) {
						sessionCost=250;
					}
					else if(sessionType.equals(ph)) {
						sessionCost=50;
					}
					calculation(sessionCost);
					break;
				case D:
					selectedDoctor="Dr.Arshad";
					System.out.println("Enter Session in online OR offline OR phonecall :  ");
					 sessionType=br3.nextLine();
					 if(sessionType.equals(on)) {
						 sessionCost=110;
					 }
					 else if(sessionType.equals(of)) {
						sessionCost=250;
					 }
					 else if(sessionType.equals(ph)) {
							sessionCost=70;
						}
					 calculation(sessionCost);
					 break;
				case E:
					selectedDoctor="Dr.Jhon";
					System.out.println("Enter Session in online OR offline OR phonecall :  ");
					sessionType=br3.nextLine();
					if(sessionType.equals(on)) {
						sessionCost=100;
					 }
					else if(sessionType.equals(of)) {
						sessionCost=200;
					}
					else if(sessionType.equals(ph)) {
						sessionCost=80;
					}
					calculation(sessionCost);
					break;
				case F:
					selectedDoctor="Dr.Meera";
					System.out.println("Enter Session in online OR offline OR phonecall :  ");
					sessionType=br3.nextLine();
					if(sessionType.equals(on)) {
						sessionCost=110;
					 }
					else if(sessionType.equals(of)) {
						sessionCost=280;
					}
					else if(sessionType.equals(ph)) {
						sessionCost=60;
					}
					calculation(sessionCost);
					break;
				case G:
					selectedDoctor="Dr.Vikram";
					System.out.println("Enter Session in online OR offline OR phonecall :  ");
					sessionType=br3.nextLine();
					if(sessionType.equals(on)) {
						sessionCost=150;
					}
					else if(sessionType.equals(of)) {
						sessionCost=250;
					}
					else if(sessionType.equals(ph)) {
						sessionCost=65;
					}
					calculation(sessionCost);
					break;
		}

    }
    

}

