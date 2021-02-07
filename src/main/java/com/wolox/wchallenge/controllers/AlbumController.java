package com.wolox.wchallenge.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolox.wchallenge.model.Album;

@RestController
@RequestMapping("/api/albums")
public interface AlbumController {
	
	@GetMapping
	public ResponseEntity<List<Album>> getAllAlbums();
	
	@GetMapping("/{userId}")
	public ResponseEntity<List<Album>> getAlbumByUser(@PathVariable("userId") Long userId);

}
