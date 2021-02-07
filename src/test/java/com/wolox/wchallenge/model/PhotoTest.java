package com.wolox.wchallenge.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class PhotoTest {
	
	@Test
	public void testGettersAndSetters() {
		
		Photo photo = new Photo();
		photo.setAlbumId(1L);
		photo.setThumbnailUrl("");
		photo.setTitle("");
		photo.setUrl("");
		
		assertNotNull(photo.getAlbumId());
		assertNotNull(photo.getThumbnailUrl());
		assertNotNull(photo.getTitle());
		assertNotNull(photo.getUrl());
	
		
	}
	
	@Test
	public void testHashCodeWithValues() {
		
		Photo photo = new Photo();
		photo.setAlbumId(1L);
		photo.setThumbnailUrl("");
		photo.setTitle("");
		photo.setUrl("");

		assertNotNull(photo.hashCode());
	}
	
	@Test
	public void toStringTest() {
		
		Photo photo = new Photo();
		photo.setAlbumId(1L);
		photo.setThumbnailUrl("");
		photo.setTitle("");
		photo.setUrl("");
		
		assertNotNull(photo.toString());
		
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenObjectEquals() {
		Photo photo = new Photo();
		assertTrue(photo.equals((Object)photo));		
		
	}
	
	@Test
	public void equalsTestShouldReturnFalseWhenNull() {
		Photo photo = new Photo();
		assertFalse(photo.equals(null));	
		}
	
	@Test
	public void equalsTestShouldReturnFalseWhenDifferentClass() {
		Photo photo = new Photo();
		Object test = new Object();
		assertFalse(photo.equals(test));	
	
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenSameObject() {
		
		Photo photo = new Photo();
		photo.setAlbumId(1L);
		photo.setThumbnailUrl("");
		photo.setTitle("");
		photo.setUrl("");
		
		Photo photoTest = new Photo();
		photoTest.setAlbumId(1L);
		photoTest.setThumbnailUrl("");
		photoTest.setTitle("");
		photoTest.setUrl("");
		
		
		assertTrue(photo.equals(photoTest));
	}

}
