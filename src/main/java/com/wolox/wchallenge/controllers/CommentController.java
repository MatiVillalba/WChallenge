package com.wolox.wchallenge.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wolox.wchallenge.model.Comment;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/comments")
@Api
public interface CommentController {

	@GetMapping
	@ApiOperation(value = "List comments by name")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Comments found"),
			@ApiResponse(code = 404, message = "Comments not found")
	})
	public ResponseEntity<List<Comment>> getCommentsByName(@RequestParam(name = "name", 
	  required = false) String name);
	
	@GetMapping("/{userId}")
	@ApiOperation(value = "List comments by user")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Comments found"),
			@ApiResponse(code = 404, message = "Comments not found")
	})
	public ResponseEntity<List<Comment>> getCommentsByUser(@PathVariable("userId") Long userId);

}
