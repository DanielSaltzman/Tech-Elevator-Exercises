package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCigarParty {
	private CigarParty target;
	
	@Before
	public void setup() {
		target = new CigarParty();
	}
	@After
	public void cleanup() {
		
	}
	@Test
	public void weekend_with_lots_of_cigars() {
		//Arrange 
		//Act
		boolean successful = target.haveParty(100, true);
		//Assert
		Assert.assertTrue(successful);
	}
	@Test
	public void weekend_with_barely_any_cigars() {
		//Arrange 
		//Act
		boolean successful = target.haveParty(10, true);
		//Assert
		Assert.assertFalse(successful);
	}
	@Test
	public void weekday_with_cigars_not_in_range() {
		//Arrange 
		//Act
		boolean successful = target.haveParty(100, false);
		//Assert
		Assert.assertFalse(successful);
	}
	@Test
	public void weekday_with_the_right_amount_of_cigars() {
		//Arrange 
		//Act
		boolean successful = target.haveParty(59, false);
		//Assert
		Assert.assertTrue(successful);
	}
}
