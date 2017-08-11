package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class LicenseCompliance {
	
	public ResponseEntity<ArrayList<String>> method2(ArrayList<String> status) {
		//ArrayList<String> status = new ArrayList<String>();
		int i, fact = 1;
		int number = 5;// It is the number to calculate factorial
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
		status.add("Method 2 started ..........");
 		status.add("10% of Method2 executed successfully");
 		
 		
 		status.add("20% of Method2 executed successfully");
 		
 		status.add("30% of Method2 executed successfully");
 		
 		status.add("50% of Method2 executed successfully");
 		
 		status.add("100% of Method2 executed successfully");
		return new ResponseEntity<>(status, HttpStatus.OK);

	}

}
