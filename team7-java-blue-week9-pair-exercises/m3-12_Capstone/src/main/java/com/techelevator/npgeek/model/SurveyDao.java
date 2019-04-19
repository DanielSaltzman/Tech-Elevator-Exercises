package com.techelevator.npgeek.model;

import java.util.List;
import java.util.Map;

public interface SurveyDao {

	public List<Survey>  getSurveyResults();
	public void saveSurvey(String parkcode, String emailaddress, String state, String activitylevel);
}