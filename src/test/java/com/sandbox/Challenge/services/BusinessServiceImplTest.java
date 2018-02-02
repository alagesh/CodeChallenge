package com.sandbox.Challenge.services;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.sandbox.Challenge.services.Impl.BusinessServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class BusinessServiceImplTest {
	
	@Mock
	ApiService apiService;

	@InjectMocks
	BusinessServiceImpl service;

}
