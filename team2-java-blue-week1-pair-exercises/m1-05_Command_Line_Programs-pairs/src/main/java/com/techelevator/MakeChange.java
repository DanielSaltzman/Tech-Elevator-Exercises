package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then display the change required.
 
 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	
	
	public static void main(String[] args) {
		
		//ask for user input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the amount of the bill: ");
		
		
		String userInput = input.nextLine();
		double amount = Double.parseDouble(userInput);
		
		//amount tendered
		System.out.print("Please enter the amount tendered: ");
		
		String tenderedStr = input.nextLine();
		double tendered = Double.parseDouble(tenderedStr);
		
		//change required
		double change = tendered - amount;
		System.out.println("The change required is " + change);

	}

}
