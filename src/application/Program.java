package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		try {
		for (int i=1; i<=1; i++) {
			System.out.println("Enter acount data");
			System.out.println("Number:");
			Integer number = sc.nextInt();
			System.out.println("Holder:");
			String holder = sc.next();
			System.out.println("Inicial Balance:");
			double balance = sc.nextDouble();
			System.out.println("Withdraw Limit:");
			double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdrawLimit);  
		}
		
		System.out.println();
		System.out.print("Enter amout for withdraw:");
		double amount = sc.nextDouble();
		
		} 
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
