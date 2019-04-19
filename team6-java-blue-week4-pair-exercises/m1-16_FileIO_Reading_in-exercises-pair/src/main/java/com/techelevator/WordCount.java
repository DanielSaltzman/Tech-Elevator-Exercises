package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;



public class WordCount {

	public static void main(String[] args) throws FileNotFoundException{
		File inputFile = getFileFromUser();
		int lineCount = 4046;
		int sentenceCount = 0;
		int wordCount = 0;
		try (Scanner fileIn = new Scanner(inputFile)) {
			
			int lineNumber = 0;
			
			while(fileIn.hasNextLine() && lineNumber < lineCount) {
				String line = fileIn.nextLine();
				lineNumber++;
				
				for(int i = 0; i < line.length(); i++) {
					
				
					
					if(line.charAt(i) ==  ' ') {
						
						wordCount++;
						
					}
					
					
					
					
				}
				
				if(line.contains(".") || line.contains("!") || line.contains("?")) {
					
					sentenceCount++;
					
				}
				
//					System.out.println(lineNumber + " : " + line);
			}
			System.out.println("Sentence: " + sentenceCount);
			System.out.println("WordCount: " + wordCount);
			
		} catch(FileNotFoundException ex) {
			
			throw ex;
			
		}
		

	}
	private static File getFileFromUser() {
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();
		
		File inputFile = new File(path);
		if(inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); // Ends the program
		} else if(inputFile.isFile() == false) {
			System.out.println(path+" is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}

}
