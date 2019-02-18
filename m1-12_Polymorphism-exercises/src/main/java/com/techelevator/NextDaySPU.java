package com.techelevator;

public class NextDaySPU implements DeliveryDriver{
	private int weightInOunces;
	private int distanceInMiles;
	private int mailClass;
	
	public NextDaySPU (int distanceInMiles, int weightInOunces, int mailClass) {
		this.distanceInMiles = distanceInMiles;
		this.weightInOunces = weightInOunces;
		this.mailClass = mailClass;
	}
	public String toString() {
		String formatted = String.format("$%.2f", calculateRate(distanceInMiles, weightInOunces));
		String mailClassType = "SPU ";
		if (mailClass == 1) {
			mailClassType += "(next day)";
		
		}
		return String.format("%1$-31s %2$s", mailClassType, formatted);
	}
	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0.0;
		double weightInPounds = (double) weightInOunces / 16;
		
		if(mailClass == 1) {
			rate = 0.075;
		}
		return weightInPounds * rate * distanceInMiles;
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
