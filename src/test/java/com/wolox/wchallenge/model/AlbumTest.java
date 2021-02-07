package com.wolox.wchallenge.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class AlbumTest {
	
	@Test
	public void testGettersAndSetters() {
		
		Album album = new Album();
		album.setTitle("");
		album.setUserId(1L);
		
		assertNotNull(album.getTitle());
		assertNotNull(album.getUserId());
	
		
	}
	
	@Test
	public void testHashCodeWithValues() {
		
		Album album = new Album();
		album.setTitle("");
		album.setUserId(1L);

		assertNotNull(album.hashCode());
	}
	
	@Test
	public void toStringTest() {
		
		Album album = new Album();
		album.setTitle("");
		album.setUserId(1L);
		
		assertNotNull(album.toString());
		
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenObjectEquals() {
		Album album = new Album();
		assertTrue(album.equals((Object)album));		
		
	}
	
	@Test
	public void equalsTestShouldReturnFalseWhenNull() {
		Album album = new Album();
		assertFalse(album.equals(null));	
		}
	
	@Test
	public void equalsTestShouldReturnFalseWhenDifferentClass() {
		Album album = new Album();
		Object test = new Object();
		assertFalse(album.equals(test));	
	
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenSameObject() {
		
		Album album = new Album();
		album.setTitle("");
		album.setUserId(1L);
		
		Album albumTest = new Album();
		albumTest.setTitle("");
		albumTest.setUserId(1L);
		
		
		assertTrue(album.equals(albumTest));
	}

}
