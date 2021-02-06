package com.wolox.wchallenge.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class AddressTest {
	
	@Test
	public void testGettersAndSetters() {
		
		Address address = new Address();
		address.setCity("");
		address.setGeo(new Geo());
		address.setStreet("");
		address.setSuite("");
		address.setZipcode("");
		
		assertNotNull(address.getCity());
		assertNotNull(address.getGeo());
		assertNotNull(address.getStreet());
		assertNotNull(address.getSuite());
		assertNotNull(address.getZipcode());
		
	}
	
	@Test
	public void testHashCodeWithValues() {
		
		Address address = new Address();
		address.setCity("");
		address.setGeo(new Geo());
		address.setStreet("");
		address.setSuite("");
		address.setZipcode("");

		assertNotNull(address.hashCode());
	}
	
	@Test
	public void toStringTest() {
		
		Address address = new Address();
		address.setCity("");
		address.setGeo(new Geo());
		address.setStreet("");
		address.setSuite("");
		address.setZipcode("");
		
		assertNotNull(address.toString());
		
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenObjectEquals() {
		Address address = new Address();
		assertTrue(address.equals((Object)address));		
		
	}
	
	@Test
	public void equalsTestShouldReturnFalseWhenNull() {
		Address address = new Address();
		assertFalse(address.equals(null));	
		}
	
	@Test
	public void equalsTestShouldReturnFalseWhenDifferentClass() {
		Address address = new Address();
		Object test = new Object();
		assertFalse(address.equals(test));	
	
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenSameObject() {
		
		Address address = new Address();
		address.setCity("");
		address.setGeo(new Geo());
		address.setStreet("");
		address.setSuite("");
		address.setZipcode("");
		
		Address addressTest = new Address();
		addressTest.setCity("");
		addressTest.setGeo(new Geo());
		addressTest.setStreet("");
		addressTest.setSuite("");
		addressTest.setZipcode("");
		
		
		assertTrue(address.equals(addressTest));
	}

}
