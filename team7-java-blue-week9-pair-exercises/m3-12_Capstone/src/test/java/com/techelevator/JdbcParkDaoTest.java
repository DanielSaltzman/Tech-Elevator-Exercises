package com.techelevator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.techelevator.npgeek.model.JdbcParkDao;
import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.ParkDao;
import com.techelevator.npgeek.model.Weather;

public class JdbcParkDaoTest extends DAOIntegrationTest {
	
	
	@Autowired
	private JdbcParkDao parkDao;


	@Before
	public void setup() {
		parkDao = new JdbcParkDao(getDataSource());
	}
	
	

	@Test
	public void getAllParks_Returns_Populated_List() {
		List<Park> test = parkDao.getAllParks();
		
		Assert.assertNotEquals(0, test.size());
	}
	
	@Test
	public void getParkByParkId_Returns_Null_When_Given_Invalid_Id() {
		Park park = parkDao.getParkById("WrongID");
		
		Assert.assertNull(park);
	}
	
	@Test
	public void using_CVNP_For_ParkCode_And_Returning_The_Correct_Park() {
		Park park = parkDao.getParkById("CVNP");
		
		Assert.assertEquals("Cuyahoga Valley National Park", park.getParkname());
		Assert.assertEquals("Ohio", park.getState());
		Assert.assertEquals(32832, park.getAcreage());
		Assert.assertEquals(696, park.getElevationinfeet());
		Assert.assertEquals(125.0, park.getMilesoftrail(), 0.009);
		Assert.assertEquals(0, park.getNumberofcampsites());
		Assert.assertEquals("Woodland", park.getClimate());
		Assert.assertEquals(2000, park.getYearfounded());
		Assert.assertEquals(2189849, park.getAnnualvisitorcount());
		Assert.assertEquals("Of all the paths you take in life, make sure a few of them are dirt.", park.getInspirationalquote());
		Assert.assertEquals("John Muir", park.getInspirationalquotesource());
		Assert.assertEquals("Though a short distance from the urban areas of Cleveland and Akron, Cuyahoga Valley National Park seems worlds away. The park is a refuge for native plants and wildlife, and provides routes of discovery for visitors. The winding Cuyahoga River gives way to deep forests, rolling hills, and open farmlands. Walk or ride the Towpath Trail to follow the historic route of the Ohio & Erie Canal", park.getParkdescription());
		Assert.assertEquals(0, park.getEntryfee());
		Assert.assertEquals(390, park.getNumberofanimalspecies());
	}
	
	@Test
	public void getParkSurveyResults_Adds_The_Correct_Result() {
		List<Park> testSurvey = parkDao.getParkSurveyResults();
		
		Assert.assertNotEquals(0, testSurvey.size());
	}
	
	@Test
	public void parkCode_Returns_The_Fiveday_Forecast_And_Correct_Info() {
		List<Weather> testList = parkDao.getWeatherById("CVNP");
		
		Assert.assertEquals(5, testList.size());
	}
}

