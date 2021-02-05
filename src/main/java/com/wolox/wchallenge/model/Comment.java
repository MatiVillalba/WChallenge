package com.wolox.wchallenge.model;

import lombok.Data;

@Data
public class Comment {
	
	private String postId;
	
	private String id;
	
	private String name;
	
	private String email;
	
	private String body;

}
