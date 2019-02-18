package com.techelevator;

public class SecondClassRates implements DeliveryDriver {
	private int weightInOunces;
	private int distanceInMiles;
	private int mailClass;
	
	public SecondClassRates (int distanceInMiles, int weightInOunces, int mailClass) {
		
		this.distanceInMiles = distanceInMiles;
		this.weightInOunces = weightInOunces;
		this.mailClass = mailClass;
	}
	
	public String toString() {
		String formatted = String.format("$%.2f", calculateRate(distanceInMiles, weightInOunces));
		String formattedClass = "Postal Service (" + this.mailClass;
		if(mailClass == 2) {
			formattedClass +=  "nd class)";
		}
			return String.format("%1$-31s %2$s", formattedClass, formatted); 
	}
	
	public double secondRates(int mailClass, int weightInOunces) {
		double rate = 0.0;
		
		if(weightInOunces <= 2) {
			rate = 0.0035;
		}else if(weightInOunces <= 8) {
			rate = 0.0040;
		}else if(weightInOunces <= 15) {
			rate = 0.0047;
		}else if(weightInOunces < 64) {
			rate = 0.0195;
		}else if(weightInOunces < 144) {
			rate = 0.0450;
		}else {
			rate = 0.0500;
		}
		
	 	return rate;
}
	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0.0;
		if(mailClass == 2) {
			rate = secondRates(mailClass, weightInOunces);
			
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
