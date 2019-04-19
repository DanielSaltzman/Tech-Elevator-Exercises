package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import com.techelevator.npgeek.model.Weather;



public class WeatherUnitTest {
	
	@Test
	public void weatherInitializes() {
		Weather test = new Weather();
		test.setParkcode("CVNP");
		test.setFivedayforecastvalue(1);
		test.setLow(27);
		test.setHigh(40);
		test.setForecast("Cloudy");
		
		Assert.assertEquals("CVNP", test.getParkcode());
		Assert.assertEquals(1, test.getFivedayforecastvalue());
		Assert.assertEquals(27, test.getLow());
		Assert.assertEquals(40, test.getHigh());
		Assert.assertEquals("Cloudy", test.getForecast());
	}
	

}
