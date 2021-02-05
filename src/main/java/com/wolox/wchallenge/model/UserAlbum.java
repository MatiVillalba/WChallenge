package com.wolox.wchallenge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UserAlbum {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userAlbumId;
	
	private Long userId;
	
	private Long albumId;
	
	private Boolean role;

}
