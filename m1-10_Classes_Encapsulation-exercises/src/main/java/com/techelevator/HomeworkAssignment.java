package com.techelevator;

public class HomeworkAssignment {
	
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;

	//constructor
	public HomeworkAssignment(int possibleMarks) {
	this.possibleMarks = possibleMarks;
	
}
	//letterGrade method

public String getLetterGrade() {
	double grade = (double) totalMarks / possibleMarks;
	if (grade >= .9) {
		return "A";
	}else if (grade >= .8) {
		return "B";
	}else if (grade >= .7) {
		return "C";
	}else if (grade >= .6) {
		return "D";
	}return "F";
}


	//Getters and Setters
	public int getTotalMarks() {
		return totalMarks;
}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
}

	public String getSubmitterName() {
		return submitterName;
}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
}

	public int getPossibleMarks() {
		return possibleMarks;
}






 






}
