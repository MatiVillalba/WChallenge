package com.wolox.wchallenge.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.wolox.wchallenge.controllers.PhotosController;
import com.wolox.wchallenge.model.Photo;
import com.wolox.wchallenge.service.WChallengeService;

@RestController
public class PhotosControllerImpl implements PhotosController {

	@Autowired
	private WChallengeService wchallengeService;
	
	@Override
	public ResponseEntity<List<Photo>> getAllPhotos() {
		
		return new ResponseEntity<> (wchallengeService.getAllPhotos(), HttpStatus.OK);
	}

	
	
}
