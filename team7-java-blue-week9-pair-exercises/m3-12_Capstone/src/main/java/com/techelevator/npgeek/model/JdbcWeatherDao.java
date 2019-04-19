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
public class JdbcWeatherDao implements WeatherDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcWeatherDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Weather> getWeatherById(String parkId) {
		List<Weather> weatherById = new ArrayList();
		String sqlSelectWeatherById = "SELECT * FROM weather  Where parkcode = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectWeatherById, parkId);
		if(results.next()) {
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
	public Map<Integer, Weather> getWeatherMap(String parkId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}	