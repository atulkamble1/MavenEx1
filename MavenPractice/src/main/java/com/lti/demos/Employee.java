package com.lti.demos;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpTax e = new EmpTax();
		double t=e.tax(26000);
		System.out.println("Employee Tax : " + t);

	}

}
