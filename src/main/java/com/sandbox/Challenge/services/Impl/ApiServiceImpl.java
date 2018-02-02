package com.sandbox.Challenge.services.Impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sandbox.Challenge.model.NearEarthObject;
import com.sandbox.Challenge.model.NeoWrapper;
import com.sandbox.Challenge.services.ApiService;

@Service("apiService")
public class ApiServiceImpl implements ApiService {

	/*
	 * Sample : https://api.nasa.gov/neo/rest/v1/feed?start_date=2015-09-07&end_date=2015-09-10&api_key=H7V98iNStSoR1hRBQJgIMHWee0W6Pf5qvfyVLk4X
	 */
	private static final String NASA_NEO_URL = 
			"https://api.nasa.gov/neo/rest/v1/feed?api_key=";
	private static final String API_KEY = 
			"H7V98iNStSoR1hRBQJgIMHWee0W6Pf5qvfyVLk4X";
			
	@Override
	public List<NearEarthObject> getAllNeoForDateRange(String start_date, String end_date) {
		
		/*
		 * Logic:
		 * 1. Consume REST API from API using api_key , start date and end date
		 * 2. Return list of Neo Objects
		 */
		
		RestTemplate restTemplate = new RestTemplate();
		System.out.println("URL Build:"+build_url(start_date,end_date));				
		NeoWrapper wrapperObject = restTemplate.getForObject(build_url(start_date,end_date), NeoWrapper.class);
		
		/*
		 * Return Near Earth Objects inside the wrapper class
		 */
		return wrapperObject.getNearEarthObjects();
	}
	
	public String build_url (String start_date , String end_date) {
	
		return  NASA_NEO_URL+API_KEY+"?start_date="+start_date+"&end_date="+end_date;
	}
}
