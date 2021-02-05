package com.wolox.wchallenge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolox.wchallenge.dto.PatchUserAlbumRolDTO;
import com.wolox.wchallenge.dto.UserAlbumDTO;
import com.wolox.wchallenge.model.UserAlbum;
import com.wolox.wchallenge.repository.UserAlbumRepository;
import com.wolox.wchallenge.service.UserAlbumService;

@Service
public class UserAlbumServiceImpl implements UserAlbumService{

	@Autowired
	private UserAlbumRepository userAlbumRepository;
	
	@Override
	public UserAlbum createUserAlbum(UserAlbumDTO userAlbumDTO) {
		
		UserAlbum userAlbum = new UserAlbum();
		long userId = userAlbumDTO.getUserId();
		long albumId = userAlbumDTO.getAlbumId();
		boolean role = userAlbumDTO.getRole();
		
		userAlbum.setUserId(userId);
		userAlbum.setAlbumId(albumId);
		userAlbum.setRole(role);
		
		return userAlbumRepository.save(userAlbum);
	}

	@Override
	public List<UserAlbum> patchUserAlbumRole(long albumId, PatchUserAlbumRolDTO patchUserAlbumRoleDTO) {
		
		List<UserAlbum> userAlbumList = userAlbumRepository.findAllByAlbumId(albumId); 
		
		userAlbumList.stream().forEach(userAlbum -> { userAlbum.setRole(patchUserAlbumRoleDTO.getRole());
		
		userAlbumRepository.save(userAlbum);
		});
		
		return userAlbumList;
	}

}