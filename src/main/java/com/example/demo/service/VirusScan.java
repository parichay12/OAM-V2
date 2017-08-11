package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


public class VirusScan {
	
	public ResponseEntity<ArrayList<String>> method1(ArrayList<String> status) {
		//ArrayList<String> status = new ArrayList<String>();
		
		int i, m = 0, flag = 0;
		int n = 17;// it is the number to be checked
		m = n / 2;
		for (i = 2; i <= m; i++) {
			if (n % i == 0) {
				System.out.println("Number is not prime");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.println("Number is prime");
		}
		status.add("Method 1 started ..........");
 		status.add("10% of Method1 executed successfully");
 		
 		
 		status.add("20% of Method1 executed successfully");
 		
 		status.add("30% of Method1 executed successfully");
 		
 		status.add("50% of Method1 executed successfully");
 		
 		status.add("100% of Method1 executed successfully");
		
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
