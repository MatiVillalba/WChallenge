package com.wolox.wchallenge.dto;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class PatchUserAlbumRolDTOTest {
	
	@Test
	public void testGettersAndSetters() {
		
		PatchUserAlbumRolDTO patchUserAlbumRolDTO = new PatchUserAlbumRolDTO();
		patchUserAlbumRolDTO.setRole(true);
		patchUserAlbumRolDTO.setUserId(1L);
		
		assertNotNull(patchUserAlbumRolDTO.getRole());
		assertNotNull(patchUserAlbumRolDTO.getUserId());
		
	}
	
	@Test
	public void testHashCodeWithValues() {
		
		PatchUserAlbumRolDTO patchUserAlbumRolDTO = new PatchUserAlbumRolDTO();
		patchUserAlbumRolDTO.setRole(true);
		patchUserAlbumRolDTO.setUserId(1L);

		assertNotNull(patchUserAlbumRolDTO.hashCode());
	}
	
	@Test
	public void toStringTest() {
		
		PatchUserAlbumRolDTO patchUserAlbumRolDTO = new PatchUserAlbumRolDTO();
		patchUserAlbumRolDTO.setRole(true);
		patchUserAlbumRolDTO.setUserId(1L);
		
		assertNotNull(patchUserAlbumRolDTO.toString());
		
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenObjectEquals() {
		PatchUserAlbumRolDTO patchUserAlbumRolDTO = new PatchUserAlbumRolDTO();
		assertTrue(patchUserAlbumRolDTO.equals((Object)patchUserAlbumRolDTO));		
		
	}
	
	@Test
	public void equalsTestShouldReturnFalseWhenNull() {
		PatchUserAlbumRolDTO patchUserAlbumRolDTO = new PatchUserAlbumRolDTO();
		assertFalse(patchUserAlbumRolDTO.equals(null));	
		}
	
	@Test
	public void equalsTestShouldReturnFalseWhenDifferentClass() {
		PatchUserAlbumRolDTO patchUserAlbumRolDTO = new PatchUserAlbumRolDTO();
		Object test = new Object();
		assertFalse(patchUserAlbumRolDTO.equals(test));	
	
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenSameObject() {
		
		PatchUserAlbumRolDTO patchUserAlbumRolDTO = new PatchUserAlbumRolDTO();
		patchUserAlbumRolDTO.setRole(true);
		patchUserAlbumRolDTO.setUserId(1L);
		
		PatchUserAlbumRolDTO patchUserAlbumRolDTOTest = new PatchUserAlbumRolDTO();
		patchUserAlbumRolDTOTest.setRole(true);
		patchUserAlbumRolDTOTest.setUserId(1L);
		
		
		assertTrue(patchUserAlbumRolDTO.equals(patchUserAlbumRolDTOTest));
	}

}
