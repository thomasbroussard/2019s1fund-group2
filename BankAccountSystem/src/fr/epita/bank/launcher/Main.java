package fr.epita.bank.launcher;

import java.util.Scanner;

import fr.epita.bank.datamodel.Savings;

public class Main {

	public static void main(String[] args) {
		System.out.println("welcome in the application");
		
		Savings savings = new Savings(500,0.0075);
		
		double interest = savings.computeInterest();
		
		System.out.println(interest);
		
		
		System.out.println("please, type an amount to withdraw from savings");
		Scanner scanner = new Scanner(System.in);
		double amount = scanner.nextDouble();		
		savings.withDraw(amount);
		
		System.out.println("you have successfully withdrawn : " + amount);
		scanner.close();
		
		
		

	}

}
