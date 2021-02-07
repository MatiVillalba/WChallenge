package com.wolox.wchallenge.dto;

import com.wolox.wchallenge.model.UserAlbum;

import lombok.Data;

@Data
public class UserAlbumDTO {
	
	private Long userId;
	
	private Long albumId;
	
	private Boolean role;
	
	public UserAlbum toModel() {
		UserAlbum userAlbum = new UserAlbum();
		
		userAlbum.setUserId(getUserId());
		userAlbum.setAlbumId(getAlbumId());
		userAlbum.setRole(getRole());
		
		return userAlbum;
	}

}
