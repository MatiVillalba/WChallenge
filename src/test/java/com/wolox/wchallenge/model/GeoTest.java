package com.wolox.wchallenge.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class GeoTest {
	
	@Test
	public void testGettersAndSetters() {
		
		Geo geo = new Geo();
		geo.setLat("");
		geo.setLng("");
		
		assertNotNull(geo.getLat());
		assertNotNull(geo.getLng());
	
		
	}
	
	@Test
	public void testHashCodeWithValues() {
		
		Geo geo = new Geo();
		geo.setLat("");
		geo.setLng("");

		assertNotNull(geo.hashCode());
	}
	
	@Test
	public void toStringTest() {
		
		Geo geo = new Geo();
		geo.setLat("");
		geo.setLng("");
		
		assertNotNull(geo.toString());
		
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenObjectEquals() {
		Geo geo = new Geo();
		assertTrue(geo.equals((Object)geo));		
		
	}
	
	@Test
	public void equalsTestShouldReturnFalseWhenNull() {
		Geo geo = new Geo();
		assertFalse(geo.equals(null));	
		}
	
	@Test
	public void equalsTestShouldReturnFalseWhenDifferentClass() {
		Geo geo = new Geo();
		Object test = new Object();
		assertFalse(geo.equals(test));	
	
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenSameObject() {
		
		Geo geo = new Geo();
		geo.setLat("");
		geo.setLng("");
		
		Geo geoTest = new Geo();
		geoTest.setLat("");
		geoTest.setLng("");
		
		
		assertTrue(geo.equals(geoTest));
	}

}
