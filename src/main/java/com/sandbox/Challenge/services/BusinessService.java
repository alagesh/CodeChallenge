package com.sandbox.Challenge.services;

import java.util.List;
import com.sandbox.Challenge.model.NearEarthObject;

/**
 * This interface provides methods for rest ws consumption
 * @author Alagesh
 *
 */
public interface BusinessService {
	
	public List<String> getValidLaunchDates(String start_date, String end_date);

}
