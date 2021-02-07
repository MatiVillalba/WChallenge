package com.wolox.wchallenge.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Photo {
	
	private Long albumId;
	
	@Setter(AccessLevel.NONE)
	private Long id;
	
	private String title;
	
	private String url;
	
	private String thumbnailUrl;

}
