package com.wolox.wchallenge.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class CommentTest {
	
	@Test
	public void testGettersAndSetters() {
		
		Comment comment = new Comment();
		comment.setBody("");
		comment.setEmail("");
		comment.setId(1L);
		comment.setName("");
		comment.setPostId(1L);
		
		assertNotNull(comment.getBody());
		assertNotNull(comment.getEmail());
		assertNotNull(comment.getId());
		assertNotNull(comment.getName());
		assertNotNull(comment.getPostId());
	
		
	}
	
	@Test
	public void testHashCodeWithValues() {
		
		Comment comment = new Comment();
		comment.setBody("");
		comment.setEmail("");
		comment.setId(1L);
		comment.setName("");
		comment.setPostId(1L);

		assertNotNull(comment.hashCode());
	}
	
	@Test
	public void toStringTest() {
		
		Comment comment = new Comment();
		comment.setBody("");
		comment.setEmail("");
		comment.setId(1L);
		comment.setName("");
		comment.setPostId(1L);
		
		assertNotNull(comment.toString());
		
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenObjectEquals() {
		Comment comment = new Comment();
		assertTrue(comment.equals((Object)comment));		
		
	}
	
	@Test
	public void equalsTestShouldReturnFalseWhenNull() {
		Comment comment = new Comment();
		assertFalse(comment.equals(null));	
		}
	
	@Test
	public void equalsTestShouldReturnFalseWhenDifferentClass() {
		Comment comment = new Comment();
		Object test = new Object();
		assertFalse(comment.equals(test));	
	
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenSameObject() {
		
		Comment comment = new Comment();
		comment.setBody("");
		comment.setEmail("");
		comment.setId(1L);
		comment.setName("");
		comment.setPostId(1L);
		
		Comment commentTest = new Comment();
		commentTest.setBody("");
		commentTest.setEmail("");
		commentTest.setId(1L);
		commentTest.setName("");
		commentTest.setPostId(1L);
		
		
		assertTrue(comment.equals(commentTest));
	}

}
