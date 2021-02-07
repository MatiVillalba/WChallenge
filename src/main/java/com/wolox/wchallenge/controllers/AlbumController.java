package com.wolox.wchallenge.controllers;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolox.wchallenge.model.Album;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/api/albums")
@Api
public interface AlbumController {
	
	@GetMapping
	@ApiOperation(value = "List all albums")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Albums found"),
			@ApiResponse(code = 404, message = "Albums not found")
	})
	public ResponseEntity<List<Album>> getAllAlbums();
	
	@GetMapping("/{userId}")
	@ApiOperation(value = "List all albums by user")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Albums found"),
			@ApiResponse(code = 200, message = "Albums not found")
	})
	public ResponseEntity<List<Album>> getAlbumByUser(@PathVariable("userId") Long userId);

}
