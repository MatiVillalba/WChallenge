package com.wolox.wchallenge.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.wolox.wchallenge.model.Address;
import com.wolox.wchallenge.model.Album;
import com.wolox.wchallenge.model.Comment;
import com.wolox.wchallenge.model.Company;
import com.wolox.wchallenge.model.Photo;
import com.wolox.wchallenge.model.User;


@RunWith(MockitoJUnitRunner.class)
public class WChallengeServiceImplTest {
	
	@InjectMocks
	private WChallengeServiceImpl wchallengeServiceImpl;
	
	@Mock
	private RestTemplate restTemplate;
	
	@Value("${JsonPlaceHolder.host}")
	private String host;
	
	public static final String USERS = "/users";
	public static final String PHOTOS = "/photos";
	public static final String ALBUMS = "/albums";
	public static final String COMMENTS = "/comments";
	public static final String NAME = "name";
	public static final String USER_ID = "userId";
	public static final String ID = "id";
	
	@Test
	public void testGetAllUsers() {
		
		User user = new User();
		user.setAddress(new Address());
		user.setCompany(new Company());
		user.setEmail("");
		user.setName("Pepe");
		user.setPhone("123");
		user.setUsername("Gonzalez");
		user.setWebsite("pepe@pepe");
		User[] users = {user};
		when(restTemplate.getForObject(host+USERS, User[].class)).thenReturn(users);
		List<User> usersList = wchallengeServiceImpl.getAllUsers();
		
		assertNotNull(usersList);
		
	}
	
	@Test
	public void testGetUserById() {
		
		User userTest = new User();
		userTest.setAddress(new Address());
		userTest.setCompany(new Company());
		userTest.setId(1L);
		userTest.setEmail("");
		userTest.setName("Pepe");
		userTest.setPhone("123");
		userTest.setUsername("Gonzalez");
		userTest.setWebsite("pepe@pepe");
		User[] users = {userTest};
		when(restTemplate.getForObject(host+USERS+"?"+ID+"="+1, User[].class)).thenReturn(users);
		User user = wchallengeServiceImpl.getUserById(1L);
		
		assertNotNull(user);
		
	}
	
	@Test
	public void testGetAllPhotos() {
		
		Photo photo = new Photo();
		photo.setAlbumId(1L);
		photo.setThumbnailUrl("");
		photo.setTitle("");
		photo.setUrl("");
		Photo[] photos = {photo};
		when(restTemplate.getForObject(host+PHOTOS, Photo[].class)).thenReturn(photos);
		List<Photo> photoTest = wchallengeServiceImpl.getAllPhotos();
		
		assertNotNull(photoTest);
		
	}
	
	@Test
	public void testGetPhotosByUser() {
		
		Photo photo = new Photo();
		photo.setAlbumId(1L);
		photo.setThumbnailUrl("");
		photo.setTitle("");
		photo.setUrl("");
		Photo[] photos = {photo};
		when(restTemplate.getForObject(host+PHOTOS+"?"+USER_ID+"="+1, Photo[].class)).thenReturn(photos);
		List<Photo> photoTest = wchallengeServiceImpl.getPhotosByUser(1L);
		
		assertNotNull(photoTest);
		
	}
	
	@Test
	public void testGetAllAlbums() {
		
		Album album = new Album();
		album.setTitle("");
		album.setUserId(1L);
		Album[] albums = {album};
		when(restTemplate.getForObject(host+ALBUMS, Album[].class)).thenReturn(albums);
		List<Album> albumsTest = wchallengeServiceImpl.getAllAlbums();
		
		assertNotNull(albumsTest);
		
	}
	
	@Test
	public void testGetAlbumByUser() {
		
		Album album = new Album();
		album.setTitle("");
		album.setUserId(1L);
		Album[] albums = {album};
		when(restTemplate.getForObject(host+ALBUMS+"?"+USER_ID+"="+1, Album[].class)).thenReturn(albums);
		List<Album> albumsTest = wchallengeServiceImpl.getAlbumByUser(1L);
		
		assertNotNull(albumsTest);
		
	}
	
	@Test
	public void testGetCommentsByName() {
		
		Comment comment = new Comment();
		comment.setBody("");
		comment.setEmail("");
		comment.setName("prueba texto");
		comment.setPostId(1L);
		Comment[] comments = {comment};
		when(restTemplate.getForObject(host+COMMENTS+"?"+NAME+"="+comment.getName(), Comment[].class)).thenReturn(comments);
		List<Comment> commentTest = wchallengeServiceImpl.getCommentsByName(comment.getName());
		
		assertNotNull(commentTest);
		
	}
	
	@Test
	public void testGetCommentsByUser() {
		
		Comment comment = new Comment();
		comment.setBody("");
		comment.setEmail("");
		comment.setName("prueba texto");
		comment.setPostId(1L);
		Comment[] comments = {comment};
		when(restTemplate.getForObject(host+COMMENTS+"?"+USER_ID+"="+1, Comment[].class)).thenReturn(comments);
		List<Comment> commentTest = wchallengeServiceImpl.getCommentsByUser(1L);
		
		assertNotNull(commentTest);
		
	}

}
