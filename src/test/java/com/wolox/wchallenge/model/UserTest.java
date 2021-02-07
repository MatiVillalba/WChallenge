package com.wolox.wchallenge.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class UserTest {
	
	@Test
	public void testGettersAndSetters() {
		
		User user = new User();
		user.setAddress(new Address());
		user.setCompany(new Company());
		user.setEmail("");
		user.setName("");
		user.setPhone("");
		user.setUsername("");
		user.setWebsite("");
		user.setId(1L);
		
		assertNotNull(user.getAddress());
		assertNotNull(user.getCompany());
		assertNotNull(user.getEmail());
		assertNotNull(user.getId());
		assertNotNull(user.getName());
		assertNotNull(user.getPhone());
		assertNotNull(user.getUsername());
		assertNotNull(user.getWebsite());
		
		
	}
	
	@Test
	public void testHashCodeWithValues() {
		
		User user = new User();
		user.setAddress(new Address());
		user.setCompany(new Company());
		user.setEmail("");
		user.setName("");
		user.setPhone("");
		user.setUsername("");
		user.setWebsite("");

		assertNotNull(user.hashCode());
	}
	
	@Test
	public void toStringTest() {
		
		User user = new User();
		user.setAddress(new Address());
		user.setCompany(new Company());
		user.setEmail("");
		user.setName("");
		user.setPhone("");
		user.setUsername("");
		user.setWebsite("");
		
		assertNotNull(user.toString());
		
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenObjectEquals() {
		User user = new User();
		assertTrue(user.equals((Object)user));		
		
	}
	
	@Test
	public void equalsTestShouldReturnFalseWhenNull() {
		User user = new User();
		assertFalse(user.equals(null));	
		}
	
	@Test
	public void equalsTestShouldReturnFalseWhenDifferentClass() {
		User user = new User();
		Object test = new Object();
		assertFalse(user.equals(test));	
	
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenSameObject() {
		
		User user = new User();
		user.setAddress(new Address());
		user.setCompany(new Company());
		user.setEmail("");
		user.setName("");
		user.setPhone("");
		user.setUsername("");
		user.setWebsite("");
		
		User userTest = new User();
		userTest.setAddress(new Address());
		userTest.setCompany(new Company());
		userTest.setEmail("");
		userTest.setName("");
		userTest.setPhone("");
		userTest.setUsername("");
		userTest.setWebsite("");
		
		assertTrue(user.equals(userTest));
	}

}
