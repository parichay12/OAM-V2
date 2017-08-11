package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ModelCompliance {
	
	public ResponseEntity<ArrayList<String>> method4(ArrayList<String> status) {
		//ArrayList<String> status = new ArrayList<String>();
		int number = 17654; //reverse number
		int reverse = 0;
		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
			System.out.println("reverse number is"+number);
		}
		status.add("Method 4 started ..........");
 		status.add("10% of Method4 executed successfully");
 		
 		
 		status.add("20% of Method4 executed successfully");
 		
 		status.add("30% of Method4 executed successfully");
 		
 		status.add("50% of Method4 executed successfully");
 		
 		status.add("100% of Method4 executed successfully");
		return new ResponseEntity<>(status, HttpStatus.OK);

	}

}
