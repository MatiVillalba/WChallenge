package com.wolox.wchallenge.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class UserAlbumTest {
	
	@Test
	public void testGettersAndSetters() {
		
		UserAlbum userAlbum = new UserAlbum();
		userAlbum.setAlbumId(1L);
		userAlbum.setRole(true);
		userAlbum.setUserAlbumId(1L);
		userAlbum.setUserId(1L);
		
		assertNotNull(userAlbum.getAlbumId());
		assertNotNull(userAlbum.getRole());
		assertNotNull(userAlbum.getUserAlbumId());
		assertNotNull(userAlbum.getUserId());
	
		
	}
	
	@Test
	public void testHashCodeWithValues() {
		
		UserAlbum userAlbum = new UserAlbum();
		userAlbum.setAlbumId(1L);
		userAlbum.setRole(true);
		userAlbum.setUserAlbumId(1L);
		userAlbum.setUserId(1L);

		assertNotNull(userAlbum.hashCode());
	}
	
	@Test
	public void toStringTest() {
		
		UserAlbum userAlbum = new UserAlbum();
		userAlbum.setAlbumId(1L);
		userAlbum.setRole(true);
		userAlbum.setUserAlbumId(1L);
		userAlbum.setUserId(1L);
		
		assertNotNull(userAlbum.toString());
		
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenObjectEquals() {
		UserAlbum userAlbum = new UserAlbum();
		assertTrue(userAlbum.equals((Object)userAlbum));		
		
	}
	
	@Test
	public void equalsTestShouldReturnFalseWhenNull() {
		UserAlbum userAlbum = new UserAlbum();
		assertFalse(userAlbum.equals(null));	
		}
	
	@Test
	public void equalsTestShouldReturnFalseWhenDifferentClass() {
		UserAlbum userAlbum = new UserAlbum();
		Object test = new Object();
		assertFalse(userAlbum.equals(test));	
	
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenSameObject() {
		
		UserAlbum userAlbum = new UserAlbum();
		userAlbum.setAlbumId(1L);
		userAlbum.setRole(true);
		userAlbum.setUserAlbumId(1L);
		userAlbum.setUserId(1L);
		
		UserAlbum userAlbumTest = new UserAlbum();
		userAlbumTest.setAlbumId(1L);
		userAlbumTest.setRole(true);
		userAlbumTest.setUserAlbumId(1L);
		userAlbumTest.setUserId(1L);
		
		
		assertTrue(userAlbum.equals(userAlbumTest));
	}

}
