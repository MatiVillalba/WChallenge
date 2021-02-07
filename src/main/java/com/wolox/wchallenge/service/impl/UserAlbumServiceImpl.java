package com.wolox.wchallenge.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private final Logger logger = LoggerFactory.getLogger(getClass().getName());
	
	@Autowired
	private WChallengeService wchallengeService;
	
	@Autowired
	private UserAlbumRepository userAlbumRepository;
	
	@Override
	public UserAlbum createUserAlbum(UserAlbumDTO userAlbumDTO) {
		
		logger.info("Creating userAlbum");
		
		return userAlbumRepository.save(userAlbumDTO.toModel());
	}

	@Override
	public List<UserAlbum> patchUserAlbumRole(long albumId, PatchUserAlbumRolDTO patchUserAlbumRoleDTO) {
		
		logger.info("Patching user Role");
		
		List<UserAlbum> userAlbumList = userAlbumRepository.findAllByAlbumId(albumId); 
		
		userAlbumList.stream().forEach(userAlbum -> { userAlbum.setRole(patchUserAlbumRoleDTO.getRole());
		
		userAlbumRepository.save(userAlbum);
		});
		
		return userAlbumList;
	}

	@Override
	public List<User> getAllUsersByAlbumAndRole(long albumId, Boolean role) {
		
		logger.info("Getting all users by album and role");
		
		List<User> users = new ArrayList<>();
		
		List<Long> userIdList = userAlbumRepository.findAllByAlbumIdAndRole(albumId, role);
		
		userIdList.stream().forEach(userId -> users.add(wchallengeService.getUserById(userId)));
		
		return users;
	}

}
