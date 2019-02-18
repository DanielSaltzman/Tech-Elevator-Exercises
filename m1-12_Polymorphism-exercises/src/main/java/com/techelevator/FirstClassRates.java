package com.techelevator;

public class FirstClassRates implements DeliveryDriver {
	

	private int weightInOunces;
	private int distanceInMiles;
	private int mailClass;
	
	public FirstClassRates (int distanceInMiles, int weightInOunces, int mailClass) {
		
		this.distanceInMiles = distanceInMiles;
		this.weightInOunces = weightInOunces;
		this.mailClass = mailClass;
	}
	
	public double firstRates(int mailClass, int weightInOunces) {
		double rate = 0.0;
		
		if(weightInOunces <= 2) {
			rate = 0.035;
		}else if(weightInOunces <= 8) {
			rate = 0.040;
		}else if(weightInOunces <= 15) {
			rate = 0.047;
		}else if(weightInOunces < 64) {
			rate = 0.195;
		}else if(weightInOunces < 144) {
			rate = 0.450;
		}else {
			rate = 0.500;
		}
		
	 	return rate;
}
	public String toString() {
		String formatted = String.format("$%.2f", calculateRate(distanceInMiles, weightInOunces));
		String formattedClass = "Postal Service (" + this.mailClass;
		if(mailClass == 1) {
			formattedClass +=  "st class)";
		}
			return String.format("%1$-31s %2$s", formattedClass, formatted); 
	}
	
	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0.0;
		if(mailClass == 1) {
			rate = firstRates(mailClass, weightInOunces);
			
		}
		return (double) rate * distanceInMiles;
		
	}

	public int getWeightInOunces() {
		return weightInOunces;
	}

	public int getDistanceInMiles() {
		return distanceInMiles;
	}

	public int getMailClass() {
		return mailClass;
	}
	
}
