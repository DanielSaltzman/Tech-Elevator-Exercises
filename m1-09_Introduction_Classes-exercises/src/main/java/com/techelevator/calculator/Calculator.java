package com.techelevator.calculator;

public class Calculator {

	
	private int currentValue = 0;

	//methods
	public int add(int addend) {
		return currentValue += addend;
	}
	
	public int multiply(int multiplier) {
		return currentValue = currentValue * multiplier;
	}
	
	public int subtract(int subtrahend) {
		return currentValue -= subtrahend;
	}
	
	public int power(int exponents) {
		return (currentValue = (int) Math.pow(currentValue, exponents));
	}
	
	public void reset() {
		currentValue = 0;
	}
	
	//getter
	public int getCurrentValue() {
		return currentValue;
	}
	
	
	
	
}
