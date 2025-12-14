package com.tcs.service.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.tcs.service.CalculationService;

class Calculation {

	CalculationService calculationservice = new CalculationService();
	
	@Test
	public void addTest() {
		
		assertEquals(4, calculationservice.add(2,2));//4 means ,its excpecting 4 in calculateservice.add
		
	}
	
	@Test
	public void checkeligible() {
		assertTrue(calculationservice.checkEligibility(24));
	}
	
	@Test
	public void checkCondtionFalse() {
		assertFalse(calculationservice.checkEligibility(16));
	}
	
	@Test
	public void notEquals() {
		assertNotEquals(4, 3);
	}
	
	@Test
	public void notNull() {
		assertNotNull(calculationservice);
	}
	
	@Test
	public void checkException() {
		assertThrows(IllegalArgumentException.class, ()->{calculationservice.checkEligibility(17);});
	}

}








