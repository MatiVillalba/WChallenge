package com.wolox.wchallenge.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wolox.wchallenge.model.Comment;

@RestController
@RequestMapping("/api/comments")
public interface CommentController {

	@GetMapping
	public ResponseEntity<List<Comment>> getCommentsByName(@RequestParam(name = "name", 
	  required = false) String name);
	
	@GetMapping("/{userId}")
	public ResponseEntity<List<Comment>> getCommentsByUser(@PathVariable("userId") Long userId);

}
