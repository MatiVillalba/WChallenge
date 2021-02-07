package com.wolox.wchallenge.service.impl;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wolox.wchallenge.exceptions.JsonPlaceHolderServiceExceptionHandler;
import com.wolox.wchallenge.model.Album;
import com.wolox.wchallenge.model.Comment;
import com.wolox.wchallenge.model.Photo;
import com.wolox.wchallenge.model.User;
import com.wolox.wchallenge.service.WChallengeService;

@Service
public class WChallengeServiceImpl implements WChallengeService {
	
	private final Logger logger = LoggerFactory.getLogger(getClass().getName());

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
		
		logger.info("Getting all users");
		User[] users;
		
		try {
			users = restTemplate.getForObject(host+USERS, User[].class);
		} catch(Exception e) {
			throw new JsonPlaceHolderServiceExceptionHandler();
		}
		
		return Arrays.asList(users);
	}
	
	@Override
	public User getUserById(Long userId) {
		
		logger.info("Getting user by id");
		
		String filter = String.format(FILTER_ID, userId);
		
		User[] userData;
		
		try {
			userData = restTemplate.getForObject(host+USERS+filter, User[].class);
		} catch(Exception e) {
			throw new JsonPlaceHolderServiceExceptionHandler();
		}
		
		return Arrays.asList(userData).get(0);
	}

	@Override
	public List<Photo> getAllPhotos() {
		
		logger.info("Getting all photos");
		
		Photo[] photos;
		
		try {
			photos = restTemplate.getForObject(host+PHOTOS, Photo[].class);
		} catch(Exception e) {
			throw new JsonPlaceHolderServiceExceptionHandler();
		}
		
		return Arrays.asList(photos);
	}
	
	@Override
	public List<Photo> getPhotosByUser(Long userId) {
		
		logger.info("Getting photos by user");
		
		String filter = String.format(FILTER_USER_ID, userId);
		
		Photo[] photos;
		
		try {
			photos = restTemplate.getForObject(host+PHOTOS+filter, Photo[].class);
		} catch(Exception e) {
			throw new JsonPlaceHolderServiceExceptionHandler();
		}
		
		return Arrays.asList(photos);
	}

	@Override
	public List<Album> getAllAlbums() {
		
		logger.info("Getting all albums");
		
		Album[] albums;
		
		try {
			albums = restTemplate.getForObject(host+ALBUMS, Album[].class);
		} catch(Exception e) {
			throw new JsonPlaceHolderServiceExceptionHandler();
		}
		
		return Arrays.asList(albums);
	}

	@Override
	public List<Album> getAlbumByUser(Long userId) {
		
		logger.info("Getting album by user");
		
		String filter = String.format(FILTER_USER_ID, userId);
		
		Album[] albums;
		
		try {
			albums = restTemplate.getForObject(host+ALBUMS+filter, Album[].class);
		} catch(Exception e) {
			throw new JsonPlaceHolderServiceExceptionHandler();
		}
		
		return Arrays.asList(albums);
	}

	@Override
	public List<Comment> getCommentsByName(String name) {
		
		logger.info("Getting comments by name");
		
		String filter = String.format(FILTER_NAME, name);
		
		Comment[] comments;
		
		try {
			comments = restTemplate.getForObject(host+COMMENTS+filter, Comment[].class);
		} catch(Exception e) {
			throw new JsonPlaceHolderServiceExceptionHandler();
		}
		
		return Arrays.asList(comments);
	}

	@Override
	public List<Comment> getCommentsByUser(Long userId) {
		
		logger.info("Getting comments by user");

		String filter = String.format(FILTER_USER_ID, userId);
		
		Comment[] comments;
		
		try {
			comments = restTemplate.getForObject(host+COMMENTS+filter, Comment[].class);
		} catch(Exception e) {
			throw new JsonPlaceHolderServiceExceptionHandler();
		}
		
		return Arrays.asList(comments);
	}

}
