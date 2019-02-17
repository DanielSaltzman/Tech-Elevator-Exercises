package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStringBits {
	
	private StringBits target;
	
	@Before
	public void setup() {
		target = new StringBits();
	}
	@After
	public void cleanup() {
		
	}
	@Test
	public void returns_correctly_when_give_a_string() {
		//Arrange
		//Act
		String results = target.getBits("Hello");
		//Assert
		Assert.assertEquals("Hlo", results);;
	}
	@Test
	public void returns_correctly_when_give_a_string_of_2_chars() {
		//Arrange
		//Act
		String results = target.getBits("He");
		//Assert
		Assert.assertEquals("H", results);;
	}
}
