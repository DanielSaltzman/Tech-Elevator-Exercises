package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaxEnd3 {
private MaxEnd3 target;
	
	@Before
	public void setup() {
		target = new MaxEnd3();
	}
	@After
	public void cleanup() {
		
	}
	@Test
	public void return_an_an_array_populated_with_the_biggest_number_with_biggest_at_index_0() {
		//Arrange
		int[] testArray = new int[] {3,2,1};
		//Act
		int[] results = target.makeArray(testArray);
		//Assert
		Assert.assertArrayEquals(new int[] {3,3,3}, results);
	}
	@Test 
	public void return_an_an_array_populated_with_the_biggest_number_with_biggest_at_index_1() {
		//Arrange
		int[] testArray = new int[] {2,3,1};
		//Act
		int[] results = target.makeArray(testArray);
		//Assert
		Assert.assertArrayEquals(new int[] {2,2,2}, results);
	}
	@Test
	public void return_an_an_array_populated_with_the_biggest_number_with_biggest_at_index_2() {
		//Arrange
		int[] testArray = new int[] {1,2,3};
		//Act
		int[] results = target.makeArray(testArray);
		//Assert
		Assert.assertArrayEquals(new int[] {3,3,3}, results);
	}
	
}
