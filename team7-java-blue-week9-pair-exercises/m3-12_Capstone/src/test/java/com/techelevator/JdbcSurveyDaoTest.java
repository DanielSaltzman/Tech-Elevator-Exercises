package com.techelevator;



    import com.techelevator.npgeek.model.SurveyDao;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.util.Assert;

import com.techelevator.npgeek.model.JdbcParkDao;
import com.techelevator.npgeek.model.JdbcSurveyDao;
import com.techelevator.npgeek.model.Survey;
import com.techelevator.npgeek.model.SurveyDao;



	public class JdbcSurveyDaoTest extends DAOIntegrationTest {
		
		private JdbcSurveyDao surveyDao;
		
		
		
		@Before
		public void setup() {
			surveyDao = new JdbcSurveyDao(getDataSource());
		}
		
	
		@Test
		public void survey_saves() {
			Survey test = new Survey();
			
			String parkcode = "CVNP";
			String emailaddress = "test@yahoo.com";
			String state = "AL";
			String activitylevel = "Active";
			
			
			surveyDao.saveSurvey(parkcode, emailaddress, state, activitylevel);
		    
			
			
			;
		}
	


}
