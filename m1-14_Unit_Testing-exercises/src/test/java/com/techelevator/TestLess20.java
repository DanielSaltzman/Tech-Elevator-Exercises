package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLess20 {
	
	private Less20 target;
	
	@Before
	public void setup() {
		target = new Less20();
	}
	@After
	public void cleanup() {
		
	}
	@Test
	public void integer_given_is_1_less_than_20() {
		//Arrange 
		//Act
		boolean successful = target.isLessThanMultipleOf20(19);
		//Assert
		Assert.assertTrue(successful);
	}
	@Test
	public void integer_given_is_2_less_than_20() {
		//Arrange 
		//Act
		boolean successful = target.isLessThanMultipleOf20(18);
		//Assert
		Assert.assertTrue(successful);
	}
	@Test
	public void integer_given_is_20_or_more_than_20() {
		//Arrange 
		//Act
		boolean successful = target.isLessThanMultipleOf20(20);
		//Assert
		Assert.assertFalse(successful);
	}
}
