package com.wolox.wchallenge.dto;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class UserAlbumDTOTest {
	
	@Test
	public void testGettersAndSetters() {
		
		UserAlbumDTO userAlbumDTO = new UserAlbumDTO();
		userAlbumDTO.setAlbumId(1L);
		userAlbumDTO.setRole(true);
		userAlbumDTO.setUserId(1L);
		
		assertNotNull(userAlbumDTO.getRole());
		assertNotNull(userAlbumDTO.getAlbumId());
		assertNotNull(userAlbumDTO.getUserId());
		
	}
	
	@Test
	public void testHashCodeWithValues() {
		
		UserAlbumDTO userAlbumDTO = new UserAlbumDTO();
		userAlbumDTO.setAlbumId(1L);
		userAlbumDTO.setRole(true);
		userAlbumDTO.setUserId(1L);

		assertNotNull(userAlbumDTO.hashCode());
	}
	
	@Test
	public void toStringTest() {
		
		UserAlbumDTO userAlbumDTO = new UserAlbumDTO();
		userAlbumDTO.setAlbumId(1L);
		userAlbumDTO.setRole(true);
		userAlbumDTO.setUserId(1L);

		
		assertNotNull(userAlbumDTO.toString());
		
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenObjectEquals() {
		UserAlbumDTO userAlbumDTO = new UserAlbumDTO();
		assertTrue(userAlbumDTO.equals((Object)userAlbumDTO));		
		
	}
	
	@Test
	public void equalsTestShouldReturnFalseWhenNull() {
		UserAlbumDTO userAlbumDTO = new UserAlbumDTO();
		assertFalse(userAlbumDTO.equals(null));	
		}
	
	@Test
	public void equalsTestShouldReturnFalseWhenDifferentClass() {
		UserAlbumDTO userAlbumDTO = new UserAlbumDTO();
		Object test = new Object();
		assertFalse(userAlbumDTO.equals(test));	
	
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenSameObject() {
		
		UserAlbumDTO userAlbumDTO = new UserAlbumDTO();
		userAlbumDTO.setAlbumId(1L);
		userAlbumDTO.setRole(true);
		userAlbumDTO.setUserId(1L);
		
		UserAlbumDTO userAlbumDTOTest = new UserAlbumDTO();
		userAlbumDTOTest.setAlbumId(1L);
		userAlbumDTOTest.setRole(true);
		userAlbumDTOTest.setUserId(1L);
		
		
		assertTrue(userAlbumDTO.equals(userAlbumDTOTest));
	}

}
