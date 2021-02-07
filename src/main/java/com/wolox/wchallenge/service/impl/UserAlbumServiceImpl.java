package com.wolox.wchallenge.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolox.wchallenge.dto.PatchUserAlbumRolDTO;
import com.wolox.wchallenge.dto.UserAlbumDTO;
import com.wolox.wchallenge.model.User;
import com.wolox.wchallenge.model.UserAlbum;
import com.wolox.wchallenge.repository.UserAlbumRepository;
import com.wolox.wchallenge.service.UserAlbumService;
import com.wolox.wchallenge.service.WChallengeService;

@Service
public class UserAlbumServiceImpl implements UserAlbumService{

	@Autowired
	private WChallengeService wchallengeService;
	
	@Autowired
	private UserAlbumRepository userAlbumRepository;
	
	@Override
	public UserAlbum createUserAlbum(UserAlbumDTO userAlbumDTO) {
		
		return userAlbumRepository.save(userAlbumDTO.toModel());
	}

	@Override
	public List<UserAlbum> patchUserAlbumRole(long albumId, PatchUserAlbumRolDTO patchUserAlbumRoleDTO) {
		
		List<UserAlbum> userAlbumList = userAlbumRepository.findAllByAlbumId(albumId); 
		
		userAlbumList.stream().forEach(userAlbum -> { userAlbum.setRole(patchUserAlbumRoleDTO.getRole());
		
		userAlbumRepository.save(userAlbum);
		});
		
		return userAlbumList;
	}

	@Override
	public List<User> getAllUsersByAlbumAndRole(long albumId, Boolean role) {
		
		List<User> users = new ArrayList<>();
		
		List<Long> userIdList = userAlbumRepository.findAllByAlbumIdAndRole(albumId, role);
		
		userIdList.stream().forEach(userId -> users.add(wchallengeService.getUserById(userId)));
		
		return users;
	}

}
