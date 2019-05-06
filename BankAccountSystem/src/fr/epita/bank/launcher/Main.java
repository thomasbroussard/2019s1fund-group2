package fr.epita.bank.launcher;

import fr.epita.bank.datamodel.Savings;

public class Main {

	public static void main(String[] args) {
		System.out.println("welcome in the application");
		
		Savings savings = new Savings(500,0.0075);
		
		double interest = savings.computeInterest();
		
		System.out.println(interest);
		
		savings.withDraw(200);
		
		
		
		
		
		

	}

}
