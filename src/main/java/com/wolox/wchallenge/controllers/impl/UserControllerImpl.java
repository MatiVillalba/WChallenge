package com.wolox.wchallenge.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.wolox.wchallenge.controllers.UserController;
import com.wolox.wchallenge.model.User;
import com.wolox.wchallenge.service.WChallengeService;

@RestController
public class UserControllerImpl implements UserController {

	@Autowired
	private WChallengeService wchallengeService;
	
	@Override
	public ResponseEntity<List<User>> doGetAllUsers() {
		
		return new ResponseEntity<>(wchallengeService.getAllUsers(), HttpStatus.OK);
	}

}
