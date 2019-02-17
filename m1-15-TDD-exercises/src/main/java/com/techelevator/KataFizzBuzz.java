package com.techelevator;

public class KataFizzBuzz {
	
	public String fizzBuzz(int x) {
		if(x < 1 || x > 100) {
			return "";
		}
		else if((x % 3 == 0 && x % 5 == 0)) {
			return "FizzBuzz";
		} 
		else if(x % 5 == 0) {
			return "Buzz";
		}
		else if(x % 3 == 0) {
		 return "Fizz";
		}
		else {
			return ((Integer)x).toString();
		}
	}
}
