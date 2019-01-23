//Write a command line program which prompts the user for a series of decimal integer values separated by spaces. Each decimal integer is displayed along with its equivalent binary value.

		//Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

		//460 in binary is 111001100
		//8218 in binary is 10000000011010
		//1 in binary is 1
		//31313 in binary is 111101001010001
		//987654321 in binary is 111010110111100110100010110001

package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a series of decimal integer values: ");
		String decimalString = input.nextLine();
		String[] userArray = decimalString.split(" ");
		
		for (int i = 0; i < userArray.length; i++) {
			int userValues = Integer.parseInt(userArray[i]);
			String decimalValues = Integer.toBinaryString(userValues);
			System.out.println(userValues + " in binary is " + decimalValues);
			
			
			
		}
		
	}
		
		
	}


