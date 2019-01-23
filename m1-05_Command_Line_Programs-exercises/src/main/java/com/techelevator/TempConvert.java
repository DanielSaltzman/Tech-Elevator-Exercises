package com.techelevator;

import java.util.Scanner;

//The Fahrenheit to Celsius conversion formula is:

//Tc = (Tf - 32) / 1.8
//where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit

//The Celsius to Fahrenheit conversion formula is:

//Tf = Tc * 1.8 + 32
//Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit. Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.

//Please enter the temperature: 58
//Is the temperature in (C)elcius, or (F)arenheit? F
//58F is 14C.

public class TempConvert {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter temperature here: ");
		String userInputTemp = input.nextLine();
		int userTemp =Integer.parseInt(userInputTemp);
		
		System.out.print("Is the temperature in (C)elcius, or (F)arenheit? ");
		String userTempType = input.nextLine().toLowerCase();
		
		switch(userTempType) {
		case "f" : int celsiusTemp =  (int) ((int)(userTemp - 32) / 1.8);
			System.out.println(userInputTemp + "F is " + celsiusTemp + "C");
			
			break;
		case "c": int farhTemp = ((int)(userTemp * 1.8) + 32);
		System.out.println(userInputTemp + "C is " + farhTemp + "F");
		break;
		default :
			System.out.println("Enter C or F ");
			break;
		
		}
		
		
		}
	}
		
		
		
		
		
		
		
		
		

	


