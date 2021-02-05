package com.wolox.wchallenge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wolox.wchallenge.model.Album;
import com.wolox.wchallenge.model.Comment;
import com.wolox.wchallenge.model.Photo;
import com.wolox.wchallenge.model.User;

@Service
public interface WChallengeService {
	
	public List<User> getAllUsers();
	
	public User getUserById(long userId);
	
	public List<Photo> getAllPhotos();
	
	public List<Photo> getPhotosByUser(long userId);
	
	public List<Album> getAllAlbums();
	
	public List<Album> getAlbumByUser(long userId);
	
	public List<Comment> getCommentsByName(String name);

}
