package com.sandbox.Challenge.services;

import java.util.List;
import java.util.Map;

import com.sandbox.Challenge.model.NearEarthObject;

/**
 * This interface provides methods for rest ws consumption
 * @author Alagesh
 *
 */
public interface ApiService {
	
	public Map<String, List<NearEarthObject>> getAllNeoForDateRange(String start_date, String end_date);

}
