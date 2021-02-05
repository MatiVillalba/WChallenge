package com.wolox.wchallenge.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolox.wchallenge.dto.PatchUserAlbumRolDTO;
import com.wolox.wchallenge.dto.UserAlbumDTO;
import com.wolox.wchallenge.model.UserAlbum;

@RestController
@RequestMapping("/api/user_album")
public interface UserAlbumController {
	
	@PostMapping
	public ResponseEntity<UserAlbum> postUserAlbum(@RequestBody UserAlbumDTO userAlbumDto);

	@PatchMapping("/albums/{albumId}")
	public ResponseEntity<List<UserAlbum>> patchUserAlbumRole(@PathVariable("albumId") long albumId, 
			@RequestBody PatchUserAlbumRolDTO patchUserAlbumRolDTO);
	
}
