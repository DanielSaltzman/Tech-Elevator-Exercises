package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNonStart {
	private NonStart target;
//	private String a;
//	private String b;
	
	@Before
	public void setup() {
		target = new NonStart();
//		a = "Hello";
//		b = "There";
	}
	@After
	public void cleanup() {
		
	}
	@Test
	public void given_2_strings_they_concatenate_correctly() {
		//Arrange
		//Act
		String results = target.getPartialString("Hello", "There");
		//Assert
		Assert.assertEquals("ellohere", results);;
	}
	@Test
	public void given_2_strings_and_one_is_empty() {
		//Arrange
		//Act
		String results = target.getPartialString("Hello", "");
		//Assert
		Assert.assertEquals("ello", results);
	}
}
