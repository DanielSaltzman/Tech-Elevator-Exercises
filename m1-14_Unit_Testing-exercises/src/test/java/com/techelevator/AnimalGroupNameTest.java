package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class AnimalGroupNameTest {

	private AnimalGroupName target;
	
	@Before
	public void setup() {
		target = new AnimalGroupName();
	}
	@Test
	public void correct_name_returned_when_key_is_mixed_case() {
		//Arrange (don't have one)
		//Act
		String herd = target.getHerd("PiGEoN");
		//Assert
		Assert.assertEquals("Kit", herd);
	}
	
	@Test
	public void key_not_known_returns_unknown() {
		//Arrange
		//Act
		String herd = target.getHerd("iGeon");
		//Assert
		Assert.assertEquals("unknown", herd);
	}
	
	
}
