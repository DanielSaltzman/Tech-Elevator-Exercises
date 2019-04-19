package com.techelevator.npgeek.model;

import java.util.List;
import java.util.Map;

public interface WeatherDao {

	public List<Weather> getWeatherById(String parkId);
	public Map<Integer, Weather> getWeatherMap(String parkId);

}


