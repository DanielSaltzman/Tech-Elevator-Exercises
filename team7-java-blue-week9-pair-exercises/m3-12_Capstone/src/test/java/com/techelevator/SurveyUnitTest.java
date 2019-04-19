package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import com.techelevator.npgeek.model.Survey;



public class SurveyUnitTest {

	
	
	@Test
	public void survey_initializes() {
		Survey test = new Survey();
		test.setParkcode("CVNP");
		test.setEmailaddress("saltzman_daniel@yahoo.com");
		test.setState("AL");
		test.setActivitylevel("Active");
		
		Assert.assertEquals("CVNP", test.getParkcode());
		Assert.assertEquals("saltzman_daniel@yahoo.com",  test.getEmailaddress());
		Assert.assertEquals("AL", test.getState());
		Assert.assertEquals("Active", test.getActivitylevel());
		
	}
}
