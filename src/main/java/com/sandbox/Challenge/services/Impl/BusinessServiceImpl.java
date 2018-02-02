package com.sandbox.Challenge.services.Impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandbox.Challenge.model.NearEarthObject;
import com.sandbox.Challenge.model.NeoWrapper;
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
		
		List<String> returnDates = null;
		
		/*
		 * Logic :
		 * Step 1: Obtain all NEO objects for given date range		 
		 */
		Map<String, List<NearEarthObject>>  neoList 
		= apiService.getAllNeoForDateRange(start_date,end_date);
		/*
		 *  Step 2: filter the object list to filter objects with diameter less than 0.5
		 */		
		
		neoList.forEach((k, v) -> System.out.println((k + ":" + v)));
		
		/*
		 * TODO : Filtering logic to get safe dates for launch
		 */
		/*
		List<String> returnDates =
					neoList.stream()
					.filter()
					.collect(Collectors.toList());
		*/				
			
		
		/*
		 * Step 3: Add date of corresponding objects to list and return list
		 */
		return returnDates;
	}

}
