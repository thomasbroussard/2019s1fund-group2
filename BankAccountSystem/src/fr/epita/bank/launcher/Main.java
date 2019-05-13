package fr.epita.bank.launcher;

import java.util.Scanner;

import fr.epita.bank.datamodel.ContactType;
import fr.epita.bank.datamodel.Savings;

public class Main {

	public static void main(String[] args) {
		System.out.println("welcome in the application");
		System.out.println(ContactType.MOBILE + " will be the label representing the customer mobile phone number "  );
		System.out.println(ContactType.MOBILE.getDescription() + " is the description of that entry" );
		
		
		Scanner scanner = new Scanner(System.in);
		
		Savings savings = createSavings(scanner);
		
		double interest = savings.computeInterest();
		
		System.out.println(interest);
		
		
		System.out.println("please, type an amount to withdraw from savings");
		
		double amount = scanner.nextDouble();
		savings.withDraw(amount);
		
		System.out.println("you have successfully withdrawn : " + amount);
		
		scanner.close();
		
		
		

	}
	
	private static Savings createSavings(Scanner scanner) {
		System.out.println("Savings account creation");
		System.out.println("Please enter an initial balance :");
		double initialBalance = scanner.nextDouble();
		System.out.println("Please set an interest rate :");
		double rate = scanner.nextDouble();
		Savings savings = new Savings(initialBalance,rate);
		System.out.println("The creation was successful");
		return savings;
	}

}
