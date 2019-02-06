package com.techelevator;

public class FruitTree {
	
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	//constructor
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.piecesOfFruitLeft = startingPiecesOfFruit;
		this.typeOfFruit = typeOfFruit;
	}
	
	public boolean pickFruit(int numberOfPiecesToRemove) {
		if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
			piecesOfFruitLeft -= numberOfPiecesToRemove;
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	//getters 
	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	
}
