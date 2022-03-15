package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	@Test
	void test() {
		EmpTax e = new EmpTax();
		double result = e.tax(26000);
		
		Assertions.assertEquals(5286.67, Math.round(result*100.0)/100.);
		Assertions.assertNotNull(result);
		
		double result1 =  e.tax(0.2);
		boolean flag=false;
		if(result1==0.00) {
			flag=true;
		}
		Assertions.assertFalse(flag);
		
		
	}
	
	
}
