package com.wolox.wchallenge.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.wolox.wchallenge.controllers.UserAlbumController;
import com.wolox.wchallenge.dto.PatchUserAlbumRolDTO;
import com.wolox.wchallenge.dto.UserAlbumDTO;
import com.wolox.wchallenge.model.User;
import com.wolox.wchallenge.model.UserAlbum;
import com.wolox.wchallenge.service.UserAlbumService;

@RestController
public class UserAlbumControllerImpl implements UserAlbumController {

	@Autowired
	private UserAlbumService userAlbumService;
	
	@Override
	public ResponseEntity<UserAlbum> postUserAlbum(UserAlbumDTO userAlbumDto) {
	
		return new ResponseEntity<> (userAlbumService.createUserAlbum(userAlbumDto), HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<List<UserAlbum>> patchUserAlbumRole(Long albumId, PatchUserAlbumRolDTO patchUserAlbumRolDTO) {
		
		return new ResponseEntity<> (userAlbumService.patchUserAlbumRole(albumId, patchUserAlbumRolDTO), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<User>> getAllUsersByAlbumAndRole(Long albumId, Boolean role) {
	
		return new ResponseEntity<> (userAlbumService.getAllUsersByAlbumAndRole(albumId, role), HttpStatus.OK);
	}

}
