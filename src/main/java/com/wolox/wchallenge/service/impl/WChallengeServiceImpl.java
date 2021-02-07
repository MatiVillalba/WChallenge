package com.wolox.wchallenge.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wolox.wchallenge.model.Album;
import com.wolox.wchallenge.model.Comment;
import com.wolox.wchallenge.model.Photo;
import com.wolox.wchallenge.model.User;
import com.wolox.wchallenge.service.WChallengeService;

@Service
public class WChallengeServiceImpl implements WChallengeService {

	public static final String USERS = "/users";
	public static final String PHOTOS = "/photos";
	public static final String ALBUMS = "/albums";
	public static final String COMMENTS = "/comments";
	public static final String USER_ID = "userId";
	public static final String FILTER_USER_ID = "?userId=%s";
	public static final String FILTER_NAME = "?name=%s";
	public static final String FILTER_ID = "?id=%s";
	
	@Value("${JsonPlaceHolder.host}")
	private String host;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public List<User> getAllUsers() {
		
		User[] users = restTemplate.getForObject(host+USERS, User[].class);
		
		return Arrays.asList(users);
	}
	
	@Override
	public User getUserById(Long userId) {
		
		String filter = String.format(FILTER_ID, userId);
		
		User[] userData = restTemplate.getForObject(host+USERS+filter, User[].class);
		
		return Arrays.asList(userData).get(0);
	}

	@Override
	public List<Photo> getAllPhotos() {
		
		Photo[] photos = restTemplate.getForObject(host+PHOTOS, Photo[].class);
		
		return Arrays.asList(photos);
	}
	
	@Override
	public List<Photo> getPhotosByUser(Long userId) {
		
		String filter = String.format(FILTER_USER_ID, userId);
		
		Photo[] photos = restTemplate.getForObject(host+PHOTOS+filter, Photo[].class);
		
		return Arrays.asList(photos);
	}

	@Override
	public List<Album> getAllAlbums() {

		Album[] albums = restTemplate.getForObject(host+ALBUMS, Album[].class);
		
		return Arrays.asList(albums);
	}

	@Override
	public List<Album> getAlbumByUser(Long userId) {
		
		String filter = String.format(FILTER_USER_ID, userId);

		Album[] albums = restTemplate.getForObject(host+ALBUMS+filter, Album[].class);
		
		return Arrays.asList(albums);
	}

	@Override
	public List<Comment> getCommentsByName(String name) {
		
		String filter = String.format(FILTER_NAME, name);
		
		Comment[] comments = restTemplate.getForObject(host+COMMENTS+filter, Comment[].class);
		
		return Arrays.asList(comments);
	}

	@Override
	public List<Comment> getCommentsByUser(Long userId) {

		String filter = String.format(FILTER_USER_ID, userId);
		
		Comment[] comments = restTemplate.getForObject(host+COMMENTS+filter, Comment[].class);
		
		return Arrays.asList(comments);
	}

}
