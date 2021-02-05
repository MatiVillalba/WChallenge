package com.wolox.wchallenge.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wolox.wchallenge.controllers.AlbumController;
import com.wolox.wchallenge.model.Album;
import com.wolox.wchallenge.service.WChallengeService;

@RestController
public class AlbumControllerImpl implements AlbumController {

	@Autowired
	private WChallengeService wchallengeService;
	
	@Override
	public ResponseEntity<List<Album>> getAllAlbums() {
	
		return new ResponseEntity<>(wchallengeService.getAllAlbums(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Album>> getAlbumByUser(@PathVariable("userId") long userId) {
		
		return new ResponseEntity<>(wchallengeService.getAlbumByUser(userId), HttpStatus.OK);
	}
	
	

}
