package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = getFileFromUser();
		int lineCount = 4046;
		try (Scanner fileIn = new Scanner(inputFile)) {
			
			int lineNumber = 0;
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("What is the word you are searching for? ");
			String searchWord = userInput2.nextLine();
			System.out.println("Should this search be case sensitive Y/N? ");
			String answer = userInput2.nextLine();
			
			if (answer.equals("Y")) {
			
			while(fileIn.hasNextLine() && lineNumber < lineCount) {
				String line = fileIn.nextLine();
				lineNumber++;
				
				if(line.contains(searchWord)) {
					
					System.out.println(lineNumber + " ) " + line); 
				
				}	
			}	
		}
			if (answer.equals("N")) {
				while(fileIn.hasNextLine() && lineNumber < lineCount) {
					String line = fileIn.nextLine();
					lineNumber++;
					
				String firstLetter = searchWord.substring(0, 1).toUpperCase();
				String restOfLetters = searchWord.substring(1);
				String lowerCase = firstLetter + restOfLetters;
				
				String firstLetter1 = searchWord.substring(0, 1).toLowerCase();
				String restOfLetters1 = searchWord.substring(1);
				String upperCase = firstLetter + restOfLetters;
					
				if (line.contains(searchWord) || line.contains(lowerCase) || line.contains(upperCase) || 
						line.contains(searchWord.toLowerCase()) || line.contains(searchWord.toUpperCase()))	{
					
					System.out.println(lineNumber + " ) " + line);
				}
			}
		}		
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
