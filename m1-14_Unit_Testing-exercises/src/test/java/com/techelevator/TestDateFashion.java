package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDateFashion {
private DateFashion target;
	
	@Before
	public void setup() {
		target = new DateFashion();
	}
	@After
	public void cleanup() {
		
	}
	@Test
	public void if_both_are_8_or_more() {
		//Arrange
		//Act
		int getTable = target.getATable(8,8);
		//Assert
		Assert.assertEquals(2, getTable);
	}
	@Test
	public void if_both_are_2_or_less() {
		//Arrange
		//Act
		int getTable = target.getATable(2,2);
		//Assert
		Assert.assertEquals(0, getTable);
	}
	@Test
	public void if_both_are_5() {
		//Arrange
		//Act
		int getTable = target.getATable(5,5);
		//Assert
		Assert.assertEquals(1, getTable);
	}
	@Test
	public void if_one_is_8_or_more_and_the_other_is_less_than_or_is_2() {
		//Arrange
		//Act
		int getTable = target.getATable(8,2);
		//Assert
		Assert.assertEquals(0, getTable);
	}
	
}
