package com.techelevator;

//import java.awt.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PostageCalculator {
	
	
	public static int poundsToOunces(int weightInPounds) {
		return weightInPounds * 16;
	}
	
	
	public static void main(String[] args) {
		List<DeliveryDriver> driverRates = new ArrayList<DeliveryDriver>();
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
		
		driverRates.add(new FirstClassRates(distanceInMiles, weightInOunces, 1));
		driverRates.add(new SecondClassRates(distanceInMiles, weightInOunces, 2));
		driverRates.add(new ThirdClassRates(distanceInMiles, weightInOunces, 3));
		driverRates.add(new FexEd(distanceInMiles, weightInOunces));
		driverRates.add(new FourDaySPU(distanceInMiles, weightInOunces, 3));
		driverRates.add(new TwoDaySPU(distanceInMiles, weightInOunces, 2));
		driverRates.add(new NextDaySPU(distanceInMiles, weightInOunces, 1));
		
		System.out.println("");
		System.out.println("Delivery Method                      $cost");
		System.out.println("------------------------------------------");
		
		for(DeliveryDriver driver : driverRates) {
			System.out.println(driver);
		}
	}	
		

}
