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
public class JdbcSurveyDao implements SurveyDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcSurveyDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

		
	

	@Override
	public void saveSurvey(String parkcode, String emailaddress, String state, String activitylevel) {
			String saveSurvey = "INSERT INTO survey_result(surveyid, parkcode, emailaddress, state, activitylevel) VALUES (DEFAULT, ?, ?, ?, ?)";
			jdbcTemplate.update(saveSurvey, parkcode, emailaddress, state, activitylevel);
			
		}

	@Override
	public List<Survey> getSurveyResults() {
		return null;
	}
	}
