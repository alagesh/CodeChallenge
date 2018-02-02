package com.sandbox.Challenge.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.BDDMockito.given;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.sandbox.Challenge.model.NearEarthObject;
import com.sandbox.Challenge.services.Impl.BusinessServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class BusinessServiceImplTest {
	
	@Mock
	ApiService apiService;

	@InjectMocks
	BusinessServiceImpl serviceImpl;

	
	/*
	 * Test case :  givenInputDateRange_WhenGetAllValidLaunchDates_thenReturnsEmpty
	 */
	@Test
	public void givenInputDateRange_WhenGetAllValidLaunchDates_thenReturnsEmpty() {
		String start_date="2015-09-07";
		String end_date="2015-09-13";
		
		//Given
		given(apiService.getAllNeoForDateRange(start_date, end_date))
			.willReturn(null);
		
		//When
		Map<String, List<NearEarthObject>>  actualReturn  = apiService.getAllNeoForDateRange(start_date, end_date);
		
		//Then
		assertNull(actualReturn);
		
	}
	
	/*
	 * Test case :  givenInputDateRange_WhenGetAllValidLaunchDates_thenThrowsException
	 */
	@Test(expected=RuntimeException.class)
	public void givenInputDateRange_WhenGetAllValidLaunchDates_thenThrowsException() {
		String start_date="2015-09-07";
		String end_date="2015-09-13";
		
		//Given
		given(apiService.getAllNeoForDateRange(start_date, end_date))
		.willThrow(new RuntimeException());
		
		//When
		Map<String, List<NearEarthObject>>  actualReturn  = apiService.getAllNeoForDateRange(start_date, end_date);
		
		//Then
		
		
	}
}
