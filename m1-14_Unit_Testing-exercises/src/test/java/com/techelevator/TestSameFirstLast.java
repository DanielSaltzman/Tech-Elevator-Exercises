package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSameFirstLast {
	private SameFirstLast target;
	
	@Before
	public void setup() {
		target = new SameFirstLast();
	}
	@After
	public void cleanup() {
		
	}
	@Test
	public void returns_false_when_the_first_and_last_elements_are_different() {
		//Arrange
		int[] testArray = new int[] {1, 2, 3};
		//Act
		boolean results = target.isItTheSame(testArray);
		//Assert
		Assert.assertFalse(results);
	}
	@Test
	public void returns_true_when_the_first_and_last_elements_are_the_same() {
		//Arrange
		int[] testArray = new int[] {1, 2, 1};
		//Act
		boolean results = target.isItTheSame(testArray);
		//Assert
		Assert.assertTrue(results);
	}
	@Test
	public void returns_true_when_the_first_and_last_elements_are_the_same_and_the_array_length_is_more_than_3_elements() {
		//Arrange
		int[] testArray = new int[] {1, 2, 3, 1};
		//Act
		boolean results = target.isItTheSame(testArray);
		//Assert
		Assert.assertTrue(results);
	}
	@Test
	public void returns_false_when_the_length_of_the_array_is_less_than_1() {
		//Arrange
		int[] testArray = new int[] {};
		//Act
		boolean results = target.isItTheSame(testArray);
		//Assert
		Assert.assertFalse(results);
	}
}
