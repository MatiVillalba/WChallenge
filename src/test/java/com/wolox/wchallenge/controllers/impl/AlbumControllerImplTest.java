package com.wolox.wchallenge.controllers.impl;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.client.RestTemplate;


import com.wolox.wchallenge.service.WChallengeService;



@RunWith(MockitoJUnitRunner.class)
public class AlbumControllerImplTest {
	
	@Mock
	private RestTemplate restTemplate;
	
	@InjectMocks
	private AlbumControllerImpl albumControllerImpl;
	
	@Mock
	private WChallengeService wchallengeService;
	
	@Value("${JsonPlaceHolder.host}")
	private String host;
	
	public static final String ALBUMS = "/albums";
	

}
