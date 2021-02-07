package com.wolox.wchallenge.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolox.wchallenge.model.Photo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/photos")
@Api
public interface PhotosController {
	
	@GetMapping
	@ApiOperation(value = "List all photos")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Photos found"),
			@ApiResponse(code = 404, message = "Photos not found")
	})
	public ResponseEntity<List<Photo>> getAllPhotos();
	
	@GetMapping("/{userId}")
	@ApiOperation(value = "List Photos by User")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Photos found"),
			@ApiResponse(code = 404, message = "Photos not found")
	})
	public ResponseEntity<List<Photo>> getPhotosByUser(@PathVariable Long userId);

}
