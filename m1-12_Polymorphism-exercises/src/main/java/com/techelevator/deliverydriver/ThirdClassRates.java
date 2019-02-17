package com.techelevator.deliverydriver;

public class ThirdClassRates implements DeliveryDriver {
	private int weightInOunces;
	private int distanceInMiles;
	private int mailClass;
	
	
	public ThirdClassRates(int distanceInMlles, int weightInOunces, int mailClass) {
		this.distanceInMiles = distanceInMiles;
		this.weightInOunces = weightInOunces;
		this.mailClass = mailClass;
	}
	
	

	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0.0;
		if(mailClass == 3) {
			
			rate = thirdClass(mailClass, weightInOunces);
		}
		
		return (double) rate * distanceInMiles;
		
	}
	
	public double thirdClass(int mailClass, int weightInOunces) {
		double rate = 0.0;
		
		if(weightInOunces <= 2) {
			rate = 0.0020;
		}else if (weightInOunces <= 8) {
			rate = 0.0022;
		}else if(weightInOunces <= 15) {
			rate = 0.0024;
		}else if(weightInOunces < 64) {
			rate = 0.0150;
		}else if(weightInOunces < 144) {
			rate = 0.0160;
		}else { 
			rate = 0.0170;
		}
		return rate;	
	}
	public String toString() {
		String formatted = String.format("$%2f", calculateRate(distanceInMiles, weightInOunces));
		String formattedClass = "ThirdClassRate (" + this.mailClass;
		if(mailClass == 3) {
			formattedClass +=  "rd class";
		}
			return String.format("%1$-31s %2$s", formattedClass, formatted); 
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


