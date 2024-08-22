package com.evergent.CoreJava.Rithen.Application4;

import java.util.Scanner;

//Concrete implementation of MindCareSystem

public class MindCareSystem extends AbstractModule implements MindCareService, PaymentService {
	private static final int[] DISCOUNTS = { 0, 2, 5, 8, 10 };
	private static final int[] DISCOUNT_DAYS = { 5, 10, 20, 30 };

	private static final String[] COUPON_CODES = { "WELCOME10", "SUMMER15", "FESTIVAL20" };
	private static final int[] COUPON_DISCOUNTS = { 10, 15, 20 };

	private static String sessionType;
	private static int sessionCost;
	private static int totalAmount;
	private static int sessionDays;
	private static int discountedAmount;
	private static String issue;
	private static String selectedDoctor;
	private static int discountPercentage;
	private static String module;
	private static String couponCode;
	private static int couponDiscount;

	private static boolean paymentDone = false;

	// Arrays to store doctor details
	private static final Doctor[] doctors = {
			new Doctor("Dr. Neha", "Ph.D. in Positive Psychology", 5, "****/*****",
					new String[] { "Telugu", "English" }, new String[] { "Motivation", "Stress Relief" }),
			new Doctor("Dr. Ravi", "Ph.D. in Positive Psychology", 9, "****/*****", new String[] { "Hindi", "English" },
					new String[] { "Motivation", "Stress Relief" }),
			new Doctor("Dr. Priya", "M.D. in Clinical Psychology", 7, "***.5/*****",
					new String[] { "Kannada", "English" }, new String[] { "Anxiety", "Stress Management" }),
			new Doctor("Dr. Arjun", "Ph.D. in Cognitive Behavioral Therapy", 10, "*****/*****",
					new String[] { "Tamil", "English" }, new String[] { "Depression", "Trauma" }),
			new Doctor("Dr. Sunita", "M.Sc. in Counseling Psychology", 6, "****/*****",
					new String[] { "Bengali", "English" }, new String[] { "Relationship Issues", "Self-Esteem" }),
			new Doctor("Dr. Amit", "M.D. in Psychiatry", 8, "****.5/*****", new String[] { "Gujarati", "English" },
					new String[] { "Obsessive-Compulsive Disorder", "Phobias" }),
			new Doctor("Dr. Meera", "Ph.D. in Family Therapy", 11, "*****/*****", new String[] { "Punjabi", "English" },
					new String[] { "Family Conflicts", "Marriage Counseling" }),
			new Doctor("Dr. Rahul", "M.D. in Psychotherapy", 12, "*****/*", new String[] { "Marathi", "English" },
					new String[] { "Addiction", "Chronic Stress" }),
			new Doctor("Dr. Neelam", "M.Sc. in Clinical Psychology", 4, "****/*****",
					new String[] { "Malayalam", "English" },
					new String[] { "Post-Traumatic Stress Disorder", "Sleep Disorders" }) };

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		MindCareSystem system = new MindCareSystem();
		while (true) {
			system.displayMainMenu();
			system.handleModule();
		}
	}

	private void displayMainMenu() {
		System.out.println("\nMindCare System");
		System.out.println("================================");
		System.out.println("MCS Menu");
		System.out.println("S - Select Mind Issue");
		System.out.println("P - Payment Module");
		System.out.println("R - Report Module");
		System.out.println("SD - Show Discounts");
		System.out.println("E - Quit Module");
		System.out.println("======================");
		System.out.print("Enter your Module code (S, P, R, SD, E): ");
		module = scanner.nextLine().toUpperCase();
	}

	public void handleModule() {
		switch (module) {
		case "S":
			handleMindIssue();
			break;
		case "P":
			handlePayment();
			break;
		case "R":
			handleReport();
			break;
		case "SD":
			displayDiscountSchedule();
			break;
		case "E":
			System.out.println("Thank you for using MindCare System. Goodbye!");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid module code. Please try again.");
			break;
		}
	}

	private void handleMindIssue() {
		System.out.println("Select Mind Issue");
		System.out.println("======================");
		System.out.println("M - Motivation");
		System.out.println("O - Overthinking");
		System.out.println("D - Depression");
		System.out.println("ST - Stress Relief");
		System.out.println("MM - Return to Main Menu");
		System.out.println("======================");
		System.out.print("Enter your Module code (M, D, ST, O, MM): ");
		module = scanner.nextLine().toUpperCase();

		switch (module) {
		case "M":
			issue = "Motivation";
			break;
		case "O":
			issue = "Overthinking";
			break;
		case "D":
			issue = "Depression";
			break;
		case "ST":
			issue = "Stress Relief";
			break;
		case "MM":
			System.out.println("Returning to Main Menu");
			return;
		default:
			System.out.println("Invalid issue code.");
			return;
		}
		scheduleSession(scanner);
	}

	public void scheduleSession(Scanner scanner) {
		displayDoctorList();
		String doctorCode = scanner.nextLine().toUpperCase();
		int index = doctorCode.charAt(0) - 'A';

		if (index >= 0 && index < doctors.length) {
			Doctor doctor = doctors[index];
			selectedDoctor = doctor.getName(); // Set the selected doctor's name
			System.out.print("Enter Session Type (online RS = 1000/- , offline RS = 1500/- , phonecall RS = 600/-): ");
			sessionType = scanner.nextLine().toLowerCase();
			sessionCost = doctor.getSessionCost(sessionType);
			calculation(sessionCost);
		} else {
			System.out.println("Invalid doctor code.");
		}
	}

	public void displayDoctorList() {
		System.out.println("Total Available Doctors");
		System.out.println("===============================================");
		for (int i = 0; i < doctors.length; i++) {
			Doctor doctor = doctors[i];
			char code = (char) ('A' + i);
			System.out.println(code + " - " + doctor.getDetails());
			System.out.println("-----------------------------------------------");
		}
		System.out.println("===============================================");
		System.out.print("Select One Doctor for Scheduling (A, B, C, D, E, F, G, H, I): ");
	}

	private void calculation(int sessionCost) {
		System.out.print("Enter Number of Days: ");
		sessionDays = scanner.nextInt();
		scanner.nextLine(); // Consume newline left-over
		totalAmount = sessionCost * sessionDays;

		// Calculate discount percentage based on days
		discountPercentage = 0;
		for (int i = 0; i < DISCOUNT_DAYS.length; i++) {
			if (sessionDays <= DISCOUNT_DAYS[i]) {
				discountPercentage = DISCOUNTS[i];
				break;
			}
		}

		discountedAmount = totalAmount - (totalAmount * discountPercentage / 100);

		// Apply coupon discount if any
		applyCoupon();

		if (couponDiscount > 0) {
			discountedAmount -= (discountedAmount * couponDiscount / 100);
		}

		System.out.println("Total Amount: Rs " + totalAmount);
		System.out.println("Discount Percentage: " + discountPercentage + "%");
		if (couponDiscount > 0) {
			System.out.println("Coupon Discount: " + couponDiscount + "%");
		}
		System.out.println("Discounted Amount: Rs " + discountedAmount);
	}

	public void displayInvoice() {
		System.out.println("Invoice Display");
		System.out.println("==================");
		System.out.println("Order Id: " + (Math.ceil(Math.random())));
		System.out.println("Number of Days Selected: " + sessionDays + " Days");
		System.out.println("Total Amount to Make Payment: Rs " + discountedAmount);
	}

	public void makePayment() {
		if (paymentDone) {
			System.out.println("Payment has already been made.");
			paymentDone = false;
		} else {
			System.out.println("Payment of Rs " + discountedAmount + " made successfully.");
			paymentDone = true;
		}
	}

	private void handlePayment() {
		System.out.println("Payment Module");
		System.out.println("======================");
		System.out.println("TP - To Show Total Bill To Pay");
		System.out.println("MP - To Make Payment");
		System.out.println("MM - Return to Main Menu");
		System.out.println("======================");
		System.out.print("Enter your Module code (TP, MP, MM): ");
		module = scanner.nextLine().toUpperCase();

		switch (module) {
		case "TP":
			System.out.println("Total Amount to be Paid: Rs " + discountedAmount);
			break;
		case "MP":
			makePayment();
			break;
		case "MM":
			System.out.println("Returning to Main Menu");
			break;
		default:
			System.out.println("Invalid payment option.");
			break;
		}
	}

	private void handleReport() {
		System.out.println("Report Module");
		System.out.println("======================");
		System.out.println("IO - To Display Invoice for Order Mode");
		System.out.println("SU - To Display Summary of Orders and Payments Made");
		System.out.println("MM - Return to Main Menu");
		System.out.println("======================");
		System.out.print("Enter your Module code (IO, SU, MM): ");
		module = scanner.nextLine().toUpperCase();

		switch (module) {
		case "IO":
			displayInvoice();
			break;
		case "SU":
			System.out.println("MindCare Session Summary:");
			System.out.println("======================");
			System.out.println("Issue: " + issue);
			System.out.println("Doctor Name: " + selectedDoctor); // This should now correctly display the doctor's name
			System.out.println("Session Type: " + sessionType);
			System.out.println("Total Days: " + sessionDays + " Days");
			System.out.println("Discount: " + discountPercentage + "%");
			if (couponDiscount > 0) {
				System.out.println("Coupon Discount: " + couponDiscount + "%");
			}
			System.out.println("========================================");
			System.out.println("Total Amount After Discount to be Paid = Rs " + discountedAmount + "/-");
			break;
		case "MM":
			System.out.println("Returning to Main Menu");
			break;
		default:
			System.out.println("Invalid report option.");
			break;
		}
	}

	private void displayDiscountSchedule() {
		System.out.println("Discount Schedule");
		System.out.println("======================");
		System.out.println("1-5 Days   = 0%");
		System.out.println("5-9 Days   = 2%");
		System.out.println("10-19 Days = 5%");
		System.out.println("20-30 Days = 8%");
		System.out.println("Above 30 Days = 10%");
	}

	private void applyCoupon() {
		System.out.print("Enter Coupon Code: ");
		couponCode = scanner.nextLine().toUpperCase();
		couponDiscount = 0; // Reset coupon discount
		for (int i = 0; i < COUPON_CODES.length; i++) {
			if (COUPON_CODES[i].equals(couponCode)) {
				couponDiscount = COUPON_DISCOUNTS[i];
				System.out.println("Coupon applied! Discount: " + couponDiscount + "%");
				break;
			}
		}
		if (couponDiscount == 0) {
			System.out.println("Invalid coupon code.");
		}
	}
}
