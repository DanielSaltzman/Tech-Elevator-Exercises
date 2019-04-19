package com.techelevator.npgeek.model;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.npgeek.model.Park;
import com.techelevator.npgeek.model.ParkDao;
@SessionAttributes("temperature")

@Controller 
public class ParkController {
	
	@Autowired
	private ParkDao ParkDao;
	
	@Autowired
	private SurveyDao SurveyDao;
	
	

	@RequestMapping(path = "/homepage", method=RequestMethod.GET)
	public String displayHomePage(HttpServletRequest request) {
		
		List<Park> parks = ParkDao.getAllParks();
		request.setAttribute("parks", parks);
		
		return "homepage";
	}
	
	
	@RequestMapping(path = "/parkDetail", method=RequestMethod.GET)
	public String parkDetail(HttpServletRequest request, ModelMap map) {
		
		
		Park park = ParkDao.getParkById(request.getParameter("parkcode"));
		park.setWeather(ParkDao.getWeatherById(request.getParameter("parkcode")));
		
		request.setAttribute("weather",park.getWeather());
		request.setAttribute("park", park);
		return "parkDetail";
	}
	
	
	@RequestMapping(path = "/parkDetail", method=RequestMethod.POST)
	public String parkDetailCelsius(HttpServletRequest request, ModelMap map) {
		if (request.getParameter("temp").equals("celsius")) {
			map.addAttribute("temperature", "celsius");
			} 
		else if (request.getParameter("temp").equals("fahrenheit")) {
			map.addAttribute("temperature", "fahrenheit");
			}
				
			
			 
		Park park = ParkDao.getParkById(request.getParameter("parkcode"));
		park.setWeather(ParkDao.getWeatherById(request.getParameter("parkcode")));
			
		request.setAttribute("weather",park.getWeather());
		request.setAttribute("park", park);
		return "parkDetail";
	}
	
	
	@RequestMapping(path = "/survey", method=RequestMethod.GET)
	public String parkSurvey(ModelMap map) {
	    map.addAttribute("survey", new Survey()); 

		return "survey";
	}
	
	@RequestMapping(path="/survey", method=RequestMethod.POST)
	public String registrationForm(HttpServletRequest request,
			@Valid @ModelAttribute("survey") Survey survey, 
			BindingResult result
	) {
		if(result.hasErrors()) {
			return "survey"; 
		}
	
		SurveyDao.saveSurvey(request.getParameter("parkcode"), request.getParameter("emailaddress"), request.getParameter("state"), request.getParameter("activitylevel"));    
	
		List<Park> parkSurvey = ParkDao.getParkSurveyResults();
		request.setAttribute("parkSurvey", parkSurvey);
		return "surveyResults";
	}
	
}

