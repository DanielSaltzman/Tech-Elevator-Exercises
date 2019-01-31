package com.techelevator.dog;

public class Dog {

	//
	// Write code here
	//
	
	private boolean sleeping = false;

	public String makeSound() {
		if(sleeping) {
			return "Zzzzz...";
		}else {
			return "Woof!";
		}
		
	}
	
	public void sleep() {
		sleeping = true;
	}
	
	public void wakeUp() {
		sleeping = false;
	}
	
	public boolean isSleeping() {
		return sleeping;
	}
	
}
