package com.techelevator;

public class FexEd implements DeliveryDriver {

	private int distanceInMiles;
	private int weightInOunces;
	
	public String toString() {
		String formatted = String.format("$%.2f", calculateRate(distanceInMiles, weightInOunces));
		return String.format("%1$-31s %2$s", "FexEd", formatted);
	}
	
	public FexEd(int distanceInMiles, int weightInOunces) {
			
		this.distanceInMiles = distanceInMiles;
		this.weightInOunces = weightInOunces;
	}

	public int getDistanceInMiles() {
		return distanceInMiles;
	}

	public double getWeightInOunces() {
		return weightInOunces;
	}

	@Override
	public double calculateRate(int distance, double weight) {
		
		double rate = 20.00;
		
		if(distance > 500) {
			rate += 5.00;
		}
		if(weightInOunces > 48) {
			rate =+ 3.00;
		}
		return rate;
	}
	
}
