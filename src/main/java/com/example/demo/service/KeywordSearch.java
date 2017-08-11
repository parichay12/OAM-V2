package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class KeywordSearch {
	
	public ResponseEntity<ArrayList<String>> method3(ArrayList<String> status) {
		//ArrayList<String> status = new ArrayList<String>();
		int c = 0, a, temp;
		int n = 153;// It is the number to check armstrong
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("153 is an armstrong number");
		else
			System.out.println("Not armstrong number");
		status.add("Method 3 started ..........");
 		status.add("10% of Method3 executed successfully");
 		
 		
 		status.add("20% of Method3 executed successfully");
 		
 		status.add("30% of Method3 executed successfully");
 		
 		status.add("50% of Method3 executed successfully");
 		
 		status.add("100% of Method3 executed successfully");
		return new ResponseEntity<>(status, HttpStatus.OK);

	}

}
