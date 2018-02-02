package com.sandbox.Challenge.controller;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sandbox.Challenge.model.NearEarthObject;
import com.sandbox.Challenge.model.NeoWrapper;
import com.sandbox.Challenge.services.BusinessService;

/**
 * Base controller for exposing REST End points 
 * @author Alagesh
 *
 */
@RestController
public class LaunchController {
	
	
	@Autowired
	BusinessService businessService;
	
	/**
	 * Logic: Given a start and end date, provides list of safe launch dates 
	 * Usage: http://localhost:8080/LaunchDates?start_date=2018-12-12&end_date=2018-12-17
	 * @param start_date
	 * @param end_date
	 * @return list of Dates for safe launch
	 */
	
	@GetMapping("/LaunchDates")
	public List<String> getValidLaunchDates(		
				@RequestParam("start_date") String start_date,
				@RequestParam("end_date") String end_date
			){		
		/*
		 * TODO: Data validation
		 */
		
		List<String> returnDates = businessService.getValidLaunchDates(start_date, end_date);
		
		/*
		 * TODO: Exception handling
		 */
		
		//Return valid launch dates
		 return returnDates;
		
		
	}
	
	
}
