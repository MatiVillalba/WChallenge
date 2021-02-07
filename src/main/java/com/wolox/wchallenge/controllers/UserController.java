package com.wolox.wchallenge.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolox.wchallenge.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/users")
@Api
public interface UserController {
	
	@GetMapping
	@ApiOperation(value = "List all users")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Users found"),
			@ApiResponse(code = 404, message = "Users not found")
	})
	public ResponseEntity<List<User>> doGetAllUsers();

}
