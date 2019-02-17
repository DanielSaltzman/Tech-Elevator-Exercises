package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFrontTimes {

	private FrontTimes target;
	
	@Before
	public void setup() {
		target = new FrontTimes();
	}
	@After
	public void cleanup() {
		
	}
	@Test
	public void it_returns_2_copies_if_integer_n_is_2() {
		//Arrange
		//Act
		String answer = target.generateString("Chocolate", 2);
		//Assert
		Assert.assertEquals("ChoCho", answer);
	}
	@Test
	public void it_returns_3_copies_if_integer_n_is_3() {
		//Arrange
		//Act
		String answer = target.generateString("Chocolate", 3);
		//Assert
		Assert.assertEquals("ChoChoCho", answer);
	}
	@Test
	public void if_the_string_is_less_than_3_chars_and_works_as_expected() {
		//Arrange
		//Act
		String answer = target.generateString("Ch", 2);
		//Assert
		Assert.assertEquals("ChCh", answer);
	}
}
