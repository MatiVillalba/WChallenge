package com.wolox.wchallenge.service.impl;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.wolox.wchallenge.dto.PatchUserAlbumRolDTO;
import com.wolox.wchallenge.dto.UserAlbumDTO;
import com.wolox.wchallenge.model.Address;
import com.wolox.wchallenge.model.User;
import com.wolox.wchallenge.model.UserAlbum;
import com.wolox.wchallenge.repository.UserAlbumRepository;
import com.wolox.wchallenge.service.WChallengeService;

@RunWith(MockitoJUnitRunner.class)
public class UserAlbumServiceImplTest {
	
	@InjectMocks
	private UserAlbumServiceImpl userAlbumServiceImpl;
	
	@Mock
	private UserAlbumRepository userAlbumRepository;
	
	@Mock
	private WChallengeService wchallengeService;
	
	@Test
	public void testCreateUserAlbum() {
		
		UserAlbumDTO userAlbumDTO = new UserAlbumDTO();
		userAlbumDTO.setAlbumId(1L);
		userAlbumDTO.setRole(true);
		userAlbumDTO.setUserId(1L);
		
		UserAlbum userAlbumTest = new UserAlbum();
		userAlbumTest.setAlbumId(userAlbumDTO.getAlbumId());
		userAlbumTest.setRole(userAlbumDTO.getRole());
		userAlbumTest.setUserId(userAlbumDTO.getUserId());
		
		when(userAlbumRepository.save(userAlbumTest)).thenReturn(userAlbumTest);
		
		UserAlbum userAlbum = userAlbumServiceImpl.createUserAlbum(userAlbumDTO);
		
		assertNotNull(userAlbum);
		
	}
	
	@Test
	public void testPatchUserAlbumRole() {
		
		PatchUserAlbumRolDTO patchUserAlbumRolDTO = new PatchUserAlbumRolDTO();
		patchUserAlbumRolDTO.setRole(true);
		patchUserAlbumRolDTO.setUserId(1L);
		
		UserAlbum userAlbumTest = new UserAlbum();
		userAlbumTest.setAlbumId(1L);
		userAlbumTest.setRole(false);
		userAlbumTest.setUserId(1L);
		
		List<UserAlbum> userAlbumListTest = new ArrayList<>();
		userAlbumListTest.add(userAlbumTest);
		
		when(userAlbumRepository.findAllByAlbumId(1L)).thenReturn(userAlbumListTest);
		
		when(userAlbumRepository.save(userAlbumTest)).thenReturn(userAlbumTest);
		
		List<UserAlbum> userAlbum = userAlbumServiceImpl.patchUserAlbumRole(1, patchUserAlbumRolDTO);
		
		assertNotNull(userAlbum);
		
	}
	
	@Test
	public void testGetAllUsersByAlbumAndRole() {
		
		PatchUserAlbumRolDTO patchUserAlbumRolDTO = new PatchUserAlbumRolDTO();
		patchUserAlbumRolDTO.setRole(true);
		patchUserAlbumRolDTO.setUserId(1L);
		
		UserAlbum userAlbumTest = new UserAlbum();
		userAlbumTest.setAlbumId(1L);
		userAlbumTest.setRole(false);
		userAlbumTest.setUserId(1L);
		
		List<Long> userId = new ArrayList<>();
		userId.add(1L);
		
		User user = new User();
		user.setAddress(new Address());
		user.setId(1L);
		user.setName("");
		
		when(userAlbumRepository.findAllByAlbumIdAndRole(1, true)).thenReturn(userId);
		
		when(wchallengeService.getUserById(1L)).thenReturn(user);
		
		List<User> users = userAlbumServiceImpl.getAllUsersByAlbumAndRole(1L, true);
		
		assertNotNull(users);
		
	}

}
