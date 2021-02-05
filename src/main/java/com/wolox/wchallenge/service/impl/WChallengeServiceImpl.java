package com.wolox.wchallenge.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wolox.wchallenge.model.Photo;
import com.wolox.wchallenge.model.User;
import com.wolox.wchallenge.service.WChallengeService;

@Service
public class WChallengeServiceImpl implements WChallengeService {

	public static final String USERS = "/users";
	public static final String PHOTOS = "/photos";
	
	@Value("${JsonPlaceHolder.host}")
	private String host;
	
	@Override
	public List<User> getAllUsers() {

		RestTemplate restTemplate = new RestTemplate();
		
		User[] users = restTemplate.getForObject(host+USERS, User[].class);
		
		return Arrays.asList(users);
	}

	@Override
	public List<Photo> getAllPhotos() {
		
		RestTemplate restTemplate = new RestTemplate();
		
		Photo[] photos = restTemplate.getForObject(host+PHOTOS, Photo[].class);
		
		return Arrays.asList(photos);
	}

	
}
