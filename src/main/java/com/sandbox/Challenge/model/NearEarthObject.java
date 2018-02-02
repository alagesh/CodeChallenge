package com.sandbox.Challenge.model;

import java.util.Map;

/**
 * Basic POJO to hold NearEarthObject
 * @author Alagesh
 *
 */
public class NearEarthObject {
	
    public String neo_reference_id;
    public String name;
    public Map<String, Diameter> estimated_diameter;
    
    public String getNeo_reference_id() {
    	return neo_reference_id;
	}
	
	public void setNeo_reference_id(String neo_reference_id) {
		this.neo_reference_id = neo_reference_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Diameter> getEstimated_diameter() {
		return estimated_diameter;
	}
	public void setEstimated_diameter(Map<String, Diameter> estimated_diameter) {
		this.estimated_diameter = estimated_diameter;
	}
	
    
	@Override
	public String toString() {
		return "NearEarthObject [neo_reference_id=" + neo_reference_id + ", name=" + name + "]";
	}
  }
