package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;

public class FizzWriter {

	public static void main(String[] args) throws IOException {
		
		String fizzBuzzFile = "FizzBuzz.txt";
		File newFile = new File(fizzBuzzFile);
		newFile.createNewFile();
		
		try(PrintWriter writer = new PrintWriter(newFile);
			BufferedWriter buffered= new BufferedWriter(writer)){	
		String result = "";
		for (int x = 1; x <=300; x++) {
			
			if(x > 300) {
				result = "";
			}
			else if ( x == 0) {
				result = "";
			}
			else if((x % 3 == 0 && x % 5 == 0)) {
				result = "FizzBuzz";
			} 
			else if(x % 5 == 0) {
				result = "Buzz";
			}
			else if(x % 3 == 0) {
			 result = "Fizz";
			}
			else {
				result = ((Integer)x).toString();
		}
			buffered.write(result + "\n");
		}
		}	
	}
}
