package com.wolox.wchallenge.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Comment {
	
	private Long postId;
	
	@Setter(AccessLevel.NONE)
	private Long id;
	
	private String name;
	
	private String email;
	
	private String body;

}
