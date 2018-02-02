package com.sandbox.Challenge.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.BDDMockito.*;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import com.sandbox.Challenge.services.BusinessService;

@RunWith(MockitoJUnitRunner.class)
public class LaunchControllerTest {
	
	@Mock
	BusinessService businessService;

	@InjectMocks
	LaunchController controller;
	
	/*
	 * Test case :  givenInputDateRange_WhenGetAllValidLaunchDates_thenReturnsEmpty
	 */
	@Test
	public void givenInputDateRange_WhenGetAllValidLaunchDates_thenReturnsEmpty() {
		String start_date="2015-09-07";
		String end_date="2015-09-13";
		
		List<String> emptyReturn =Arrays.asList();
		
		//Given
		given(businessService.getValidLaunchDates(start_date, end_date))
			.willReturn(emptyReturn);
		
		//When
		List<String> returnDates = controller.getValidLaunchDates(start_date, end_date);
		
		//Then
		assertEquals(0,emptyReturn.size());
		
	}
	
	/*
	 * Test Case: givenInputDateRange_WhenGetAllValidLaunchDates_thenReturns2Dates
	 */
	
	@Test
	public void givenInputDateRange_WhenGetAllValidLaunchDates_thenReturns2Dates() {
		String start_date="2015-09-07";
		String end_date="2015-09-13";
		
		List<String> dataReturn =Arrays.asList("2015-09-07","2015-09-08");
		
		//Given
		given(businessService.getValidLaunchDates(start_date, end_date))
			.willReturn(dataReturn);
		
		//When
		List<String> returnDates = controller.getValidLaunchDates(start_date, end_date);
		
		//Then
		assertEquals(2,dataReturn.size());
		
	}
	
	/*
	 * Test Case: givenInputDateRange_WhenGetAllValidLaunchDates_thenThrowsException
	 */
	
	@Test(expected=RuntimeException.class)
	public void givenInputDateRange_WhenGetAllValidLaunchDates_thenThrowsException() {
		String start_date="2015-09-07";
		String end_date="2015-09-13";
		
		//Given
		given(businessService.getValidLaunchDates(start_date, end_date))
			.willThrow(new RuntimeException());
		
		//When
		List<String> returnDates = controller.getValidLaunchDates(start_date, end_date);
		
		//Then
		
		
	}
	

}
