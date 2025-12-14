package com.tcs.service;

public class CalculationService {
	
	public int add(int a,int b) {
		if(a==0 && b==0) 
		throw new ArithmeticException("value cannot be added");
		return a+b;
	}
	
	public boolean checkEligibility(int age) {
		if(age<18) 
			throw new IllegalArgumentException("age must be greater 18");
			return true;
	}

}
