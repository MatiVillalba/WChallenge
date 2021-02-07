package com.wolox.wchallenge.model;


import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class User {

	private Long id;
	
	private String name;
	
	private String username;
	
	private String email;
	
	private Address address;
	
	private String phone;
	
	private String website;
	
	private Company company;

}
