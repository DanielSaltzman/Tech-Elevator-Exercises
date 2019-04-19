package com.techelevator.npgeek.model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcParkDao implements ParkDao{

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcParkDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	
	@Override
	public List<Park> getAllParks() {
		List<Park> allParks = new ArrayList<Park>();
		String sqlSelectAllParks = "SELECT * FROM park";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllParks);
		while(results.next()) {
			Park park = new Park();
			park.setParkname(results.getString("parkname"));
			park.setParkdescription(results.getString("parkdescription"));
			park.setParkcode(results.getString("parkcode"));
			park.setImagecode(results.getString("parkcode").toLowerCase());
			
			allParks.add(park);
		}
		return allParks;
	}
	
	
	
	
	@Override
	public Park getParkById(String parkIdNum) {
		Park parkById = null;
		String sqlSelectParkById = "SELECT * FROM park  Where park.parkcode = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectParkById, parkIdNum);
		if(results.next()) {
			parkById = new Park();
			parkById.setParkname(results.getString("parkname"));
			parkById.setParkdescription(results.getString("parkdescription"));
			parkById.setParkcode(results.getString("parkcode"));
			parkById.setState(results.getString("state"));
			parkById.setAcreage(results.getInt("acreage"));
			parkById.setElevationinfeet(results.getInt("elevationinfeet"));
			parkById.setMilesoftrail(results.getFloat("milesoftrail"));
			parkById.setNumberofcampsites(results.getInt("numberofcampsites"));
			parkById.setClimate(results.getString("climate"));
			parkById.setYearfounded(results.getInt("yearfounded"));
			parkById.setAnnualvisitorcount(results.getInt("annualvisitorcount"));
			parkById.setInspirationalquote(results.getString("inspirationalquote"));
			parkById.setInspirationalquotesource(results.getString("inspirationalquotesource"));
			parkById.setEntryfee(results.getInt("entryfee"));
			parkById.setNumberofanimalspecies(results.getInt("numberofanimalspecies"));
			parkById.setImagecode(results.getString("parkcode").toLowerCase());
			
			
			
		}
		return parkById;
	
	
	}
	@Override
	public List<Weather> getWeatherById(String parkId) {
		List<Weather> weatherById = new ArrayList();
		String sqlSelectWeatherById = "SELECT * FROM weather  Where parkcode = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectWeatherById, parkId);
		while(results.next()) {
			Weather parkWeather = new Weather();
			parkWeather.setFivedayforecastvalue(results.getInt("fivedayforecastvalue"));
			parkWeather.setForecast(results.getString("forecast"));
			parkWeather.setLow(results.getInt("low"));
			parkWeather.setHigh(results.getInt("high"));
			parkWeather.setParkcode(results.getString("parkcode"));
			
			weatherById.add(parkWeather);
	}
		return weatherById;
  }


	@Override
	public List<Park> getParkSurveyResults() {
		List<Park> parkSurveys = new ArrayList<Park>();
		String sqlSelectParkSurvey = "select park.parkname, survey_result.parkcode, count(*) FROM park Join survey_result On park.parkcode = survey_result.parkcode GROUP BY survey_result.parkcode, park.parkname Order BY count DESC";  
			 
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectParkSurvey);
		while(results.next()) {
			Park parkSurvey = new Park();
			parkSurvey.setParkname(results.getString("parkname"));
			parkSurvey.setFavorited(results.getInt("count"));
			parkSurvey.setImagecode(results.getString("parkcode").toLowerCase());
								
			
			parkSurveys.add(parkSurvey);
		}
		return parkSurveys;
	}

	
}

	
	

