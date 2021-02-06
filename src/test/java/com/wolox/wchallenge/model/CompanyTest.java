package com.wolox.wchallenge.model;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;

public class CompanyTest {
	
	@Test
	public void testGettersAndSetters() {
		
		Company company = new Company();
		company.setBs("");
		company.setCatchPhrase("");
		company.setName("");
		
		assertNotNull(company.getBs());
		assertNotNull(company.getCatchPhrase());
		assertNotNull(company.getName());
	
		
	}
	
	@Test
	public void testHashCodeWithValues() {
		
		Company company = new Company();
		company.setBs("");
		company.setCatchPhrase("");
		company.setName("");

		assertNotNull(company.hashCode());
	}
	
	@Test
	public void toStringTest() {
		
		Company company = new Company();
		company.setBs("");
		company.setCatchPhrase("");
		company.setName("");
		
		assertNotNull(company.toString());
		
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenObjectEquals() {
		Company company = new Company();
		assertTrue(company.equals((Object)company));		
		
	}
	
	@Test
	public void equalsTestShouldReturnFalseWhenNull() {
		Company company = new Company();
		assertFalse(company.equals(null));	
		}
	
	@Test
	public void equalsTestShouldReturnFalseWhenDifferentClass() {
		Company company = new Company();
		Object test = new Object();
		assertFalse(company.equals(test));	
	
	}
	
	@Test
	public void equalsTestShouldReturnTrueWhenSameObject() {
		
		Company company = new Company();
		company.setBs("");
		company.setCatchPhrase("");
		company.setName("");
		
		Company companyTest = new Company();
		companyTest.setBs("");
		companyTest.setCatchPhrase("");
		companyTest.setName("");
		
		
		assertTrue(company.equals(companyTest));
	}

}
