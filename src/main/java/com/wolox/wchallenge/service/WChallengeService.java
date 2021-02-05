package com.wolox.wchallenge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wolox.wchallenge.model.Photo;
import com.wolox.wchallenge.model.User;

@Service
public interface WChallengeService {
	
	public List<User> getAllUsers();
	
	public List<Photo> getAllPhotos();

}
