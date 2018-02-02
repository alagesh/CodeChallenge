package com.sandbox.Challenge.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Wrapper class for encapsulating all Near Earth Objects
 * @author Alagesh
 *
 */
public class NeoWrapper {
	
	/*
	 * Skipping links 
	 */
	int element_count;
	
	@JsonProperty("near_earth_objects")
	Map<String, List<NearEarthObject>> nearEarthObjects;
	
	public int getElement_count() {
		return element_count;
	}
	public void setElement_count(int element_count) {
		this.element_count = element_count;
	}
	public Map<String, List<NearEarthObject>> getNearEarthObjects() {
		return nearEarthObjects;
	}
	public void setNearEarthObjects(Map<String, List<NearEarthObject>> nearEarthObjects) {
		this.nearEarthObjects = nearEarthObjects;
	}
	
	

}
