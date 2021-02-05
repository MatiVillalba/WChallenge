package com.wolox.wchallenge.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolox.wchallenge.model.Photo;

@RestController
@RequestMapping("/api/photos")
public interface PhotosController {
	
	@GetMapping
	public ResponseEntity<List<Photo>> getAllPhotos();
	
	@GetMapping("/{userId}")
	public ResponseEntity<List<Photo>> getPhotosByUser(@PathVariable long userId);

}
