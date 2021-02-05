package com.wolox.wchallenge.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wolox.wchallenge.model.Album;
import com.wolox.wchallenge.model.Photo;
import com.wolox.wchallenge.model.User;
import com.wolox.wchallenge.service.WChallengeService;

@Service
public class WChallengeServiceImpl implements WChallengeService {

	public static final String USERS = "/users";
	public static final String PHOTOS = "/photos";
	public static final String ALBUMS = "/albums";
	public static final String USER_ID = "userId";
	
	@Value("${JsonPlaceHolder.host}")
	private String host;
	
	RestTemplate restTemplate = new RestTemplate();
	
	@Override
	public List<User> getAllUsers() {
		
		User[] users = restTemplate.getForObject(host+USERS, User[].class);
		
		return Arrays.asList(users);
	}

	@Override
	public List<Photo> getAllPhotos() {
		
		Photo[] photos = restTemplate.getForObject(host+PHOTOS, Photo[].class);
		
		return Arrays.asList(photos);
	}
	
	@Override
	public List<Photo> getPhotosByUser(long userId) {
		
		Photo[] photos = restTemplate.getForObject(host+PHOTOS+"?"+USER_ID+"="+userId, Photo[].class);
		
		return Arrays.asList(photos);
	}

	@Override
	public List<Album> getAllAlbums() {

		Album[] albums = restTemplate.getForObject(host+ALBUMS, Album[].class);
		
		return Arrays.asList(albums);
	}

	@Override
	public List<Album> getAlbumByUser(long userId) {

		Album[] albums = restTemplate.getForObject(host+ALBUMS+"?"+USER_ID+"="+userId, Album[].class);
		
		return Arrays.asList(albums);
	}

}
