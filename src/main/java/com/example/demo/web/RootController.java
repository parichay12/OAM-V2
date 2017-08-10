package com.example.demo.web;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.Service;


@Controller
public class RootController {

    @RequestMapping("/home")
    public String greeting() {       
        return "home";
    }
    
   /* @RequestMapping("/test")
    public String greetings() {       
        return "home";
    }*/
    
    @RequestMapping("/list")
    public String swagger() {       
        return "redirect:swagger-ui.html";
    }
    
    @RequestMapping(value = "/deferred/{id}", method = RequestMethod.GET)
	public @ResponseBody ArrayList<Service> method1(@PathVariable("id") int id) {
		ArrayList<Service> status = new ArrayList<Service>();
		Service service = new Service();
		if(id == 1)
		{
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
		service.setStatus("Method 1 executed successfully");
		status.add(service);
		}
		else if(id == 2)
		{
		method2(status);
		}
		else if (id ==3) {
			method3(status);
		}
		else
		{
			method4(status);
		}
		return status;
		
	}

	private  @ResponseBody ArrayList<Service> method2(ArrayList<Service> status) {
		//ArrayList<String> status = new ArrayList<String>();
		Service service = new Service();
		int i, fact = 1;
		int number = 5;// It is the number to calculate factorial
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
		service.setStatus("Method 2 executed successfully");
		status.add(service);
		return status;

	}

	private  @ResponseBody ArrayList<Service> method3(ArrayList<Service> status) {
		//ArrayList<String> status = new ArrayList<String>();
		Service service = new Service();
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
		service.setStatus("Method 3 executed successfully");
		status.add(service);
		return status;

	}

	private  @ResponseBody ArrayList<Service> method4(ArrayList<Service> status) {
		//ArrayList<String> status = new ArrayList<String>();
		Service service = new Service();
		int number = 17654; //reverse number
		int reverse = 0;
		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
			System.out.println("reverse number is"+number);
		}
		service.setStatus("Method 4 executed successfully");
		status.add(service);
		return status;

	}


}