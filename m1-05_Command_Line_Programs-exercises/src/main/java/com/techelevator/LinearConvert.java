//Write a program that converts meters to feet and vice-versa.

//The foot to meter conversion formula is:

//m = f * 0.3048
//The meter to foot conversion formula is:

//f = m * 3.2808399
//Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet. Convert the length to the opposite measurement, and display the old and new measurements to the console.

//Please enter the length: 58
//Is the measurement in (m)eter, or (f)eet? f
//58f is 17m.




package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter measurement here: ");
		String userInputLength = input.nextLine();
		int userMeasure =Integer.parseInt(userInputLength);
		
		System.out.print("Is the measurement (m)eter or (f)eet? ");
		String userLengthType = input.nextLine().toLowerCase();
		
		switch(userLengthType) {
		case "m" : int meterLength =  (int) ((int)userMeasure * 3.2808399);
			System.out.println(userInputLength + "m is " + meterLength + "f");
			
			break;
		case "f": int feetLength = (int)(userMeasure * 0.3048);
		System.out.println(userInputLength + "f is " + feetLength + "m");
		break;
		default :
			System.out.println("Enter m or f ");
			break;
		
		}
		
		
		}
	}
		

	


