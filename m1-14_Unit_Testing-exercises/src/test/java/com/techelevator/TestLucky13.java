package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLucky13 {
	
	private Lucky13 target;
	
	@Before
	public void setup() {
		target = new Lucky13();
	}
	@After
	public void cleanup() {
		
	}
	@Test
	public void array_contains_no_1s_or_3s() {
		//Arrange
		int[] testArray = new int[] {0, 2, 4};
		//Act
		boolean results = target.getLucky(testArray);
		//Assert
		Assert.assertTrue(results);
	}
	@Test
	public void array_contains_both_a_1_and_3() {
		//Arrange
		int[] testArray = new int[] {1, 2, 3};
		//Act
		boolean results = target.getLucky(testArray);
		//Assert
		Assert.assertFalse(results);
	}
	@Test
	public void array_contains_either_a_1_and_3() {
		//Arrange
		int[] testArray = new int[] {1, 2, 4};
		//Act
		boolean results = target.getLucky(testArray);
		//Assert
		Assert.assertFalse(results);
	}
}
