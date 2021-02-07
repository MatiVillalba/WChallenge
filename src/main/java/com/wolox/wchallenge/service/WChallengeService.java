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
	
	public User getUserById(Long userId);
	
	public List<Photo> getAllPhotos();
	
	public List<Photo> getPhotosByUser(Long userId);
	
	public List<Album> getAllAlbums();
	
	public List<Album> getAlbumByUser(Long userId);
	
	public List<Comment> getCommentsByName(String name);
	
	public List<Comment> getCommentsByUser(Long userId);

}
