package com.techelevator.npgeek.model;

import java.util.List;
import java.util.Map;

public interface ParkDao {

	public List<Park> getAllParks();
	public Park getParkById(String parkcode);
	public List<Weather> getWeatherById(String parkcode);
	public List<Park> getParkSurveyResults();
}