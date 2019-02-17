package com.techelevator.deliverydriver;

public class SPU implements DeliveryDriver{
	private int weightInOunces;
	private int distanceInMiles;
	private int mailClass;
	
	public SPU (int distanceInMiles, int weightInOunces, int mailClass) {
		this.distanceInMiles = distanceInMiles;
		this.weightInOunces = weightInOunces;
		this.mailClass = mailClass;
	}
	public String toString() {
		String formatted = String.format("$%.2f", calculateRate(distanceInMiles, weightInOunces));
		String mailClassType = "SPU ";
		if (mailClass == 1) {
			mailClassType += "(next day)";
		}if (mailClass = 2) {
			mailClassType += "(2-day business)";
		}else {
			mailClassType += "(4-day ground)."
		}
	}
	@Override
	public double calculateRate(int distance, double weight) {
		// TODO Auto-generated method stub
		return 0;
	}
}
