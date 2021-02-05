package com.wolox.wchallenge.controllers.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.wolox.wchallenge.controllers.CommentController;
import com.wolox.wchallenge.model.Comment;
import com.wolox.wchallenge.service.WChallengeService;

@RestController
public class CommentControllerImpl implements CommentController{

	@Autowired
	private WChallengeService wchallengeService;
	
	@Override
	public ResponseEntity<List<Comment>> getCommentsByName(String name) {
	
		return new ResponseEntity<> (wchallengeService.getCommentsByName(name), HttpStatus.OK);
	}

}
