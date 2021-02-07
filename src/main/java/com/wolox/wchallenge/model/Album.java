package com.wolox.wchallenge.model;


import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Album {
	
	private Long userId;
	
	@Setter(AccessLevel.NONE)
	private Long id;
	
	private String title;

}
