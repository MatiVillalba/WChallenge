package com.wolox.wchallenge.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wolox.wchallenge.dto.PatchUserAlbumRolDTO;
import com.wolox.wchallenge.dto.UserAlbumDTO;
import com.wolox.wchallenge.model.User;
import com.wolox.wchallenge.model.UserAlbum;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/user_album")
@Api
public interface UserAlbumController {
	
	@PostMapping
	@ApiOperation(value = "Register an album shared with a user and their permissions")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Album register"),
			@ApiResponse(code = 404, message = "Album not register")
	})
	public ResponseEntity<UserAlbum> postUserAlbum(@RequestBody UserAlbumDTO userAlbumDto);

	@PatchMapping("/albums/{albumId}")
	@ApiOperation(value = "Change a user's permissions for a specific album")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Permission changed"),
			@ApiResponse(code = 404, message = "Permission not changed")
	})
	public ResponseEntity<List<UserAlbum>> patchUserAlbumRole(@PathVariable("albumId") Long albumId, 
			@RequestBody PatchUserAlbumRolDTO patchUserAlbumRolDTO);
	
	@GetMapping("/albums/{albumId}")
	@ApiOperation(value = "List users by album and role")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Users found"),
			@ApiResponse(code = 404, message = "Users not found")
	})
	public ResponseEntity<List<User>> getAllUsersByAlbumAndRole(@PathVariable("albumId") Long albumId,
			@RequestParam(name = "role", required = false) Boolean role);
	
}
