package com.sandbox.Challenge.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandbox.Challenge.model.NearEarthObject;
import com.sandbox.Challenge.services.ApiService;
import com.sandbox.Challenge.services.BusinessService;

@Service("businessService")
public class BusinessServiceImpl implements BusinessService {
	
	@Autowired
	ApiService apiService;

	/**
	 * This method consumes API service and finds the valid launch dates
	 * Criteria: Asteroid diameter < 0.5 km
	 */
	@Override
	public List<String> getValidLaunchDates(String start_date, String end_date) {
		
		/*
		 * Logic :
		 * Step 1: Obtain all NEO objects for given date range
		 * Step 2: filter the object list to filter objects with diameter less than 0.5
		 * Step 3: Add date of corresponding objects to list and return list
		 */
		
		return null;
	}

}
