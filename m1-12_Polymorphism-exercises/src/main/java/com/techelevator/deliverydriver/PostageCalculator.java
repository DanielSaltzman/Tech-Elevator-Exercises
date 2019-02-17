package com.techelevator.deliverydriver;

//import java.awt.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PostageCalculator {
	
	
	public static int poundsToOunces(int weightInPounds) {
		return weightInPounds * 16;
	}
	
	
	public static void main(String[] args) {
		List<DeliveryDriver> distribution = new ArrayList<DeliveryDriver>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the weight of the package? ");
		int weightInOunces = Integer.parseInt(scan.nextLine());
		
		System.out.println("(P)ounds or (O)unces?");
		String poundsOrOunces = scan.nextLine();
		
		if ( poundsOrOunces.equals("P")) {
			weightInOunces = poundsToOunces(weightInOunces);
		}
		
		System.out.println("What distance will it be traveling? ");
		int distanceInMiles = Integer.parseInt(scan.nextLine());
		distribution.add(new FirstClassRates(distanceInMiles, weightInOunces, 1));
		distribution.add(new SecondClassRates(distanceInMiles, weightInOunces, 2));
		distribution.add(new ThirdClassRates(distanceInMiles, weightInOunces, 3));
	}	
		

}
