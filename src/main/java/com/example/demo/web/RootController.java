package com.example.demo.web;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.KeywordSearch;
import com.example.demo.service.LicenseCompliance;
import com.example.demo.service.ModelCompliance;
import com.example.demo.service.VirusScan;

@Controller
public class RootController {

	@RequestMapping("/home")
	public String greeting() {
		return "home";
	}

	@RequestMapping("/list")
	public String swagger() {
		return "redirect:swagger-ui.html";
	}

	@RequestMapping(value = "/deferreds/{id}", method = RequestMethod.GET)
	public ResponseEntity<ArrayList<String>> method1(@PathVariable("id") int id) {
		ArrayList<String> status = new ArrayList<String>();

		switch (id) {
		case 1:
			VirusScan virusScan = new VirusScan();
			virusScan.method1(status);
			System.out.println("inside 1");
			break;

		case 2:
			LicenseCompliance licenseCompliance = new LicenseCompliance();
			licenseCompliance.method2(status);
			System.out.println("inside 2");
			break;
		case 3:
			KeywordSearch keywordSearch = new KeywordSearch();
			keywordSearch.method3(status);
			System.out.println("inside 3");
			break;
		case 4:
			ModelCompliance modelCompliance = new ModelCompliance();
			modelCompliance.method4(status);
			System.out.println("inside 4");
			break;
		default:
			System.out.println("Not in 1, 2,3 or 4");

		}

		return new ResponseEntity<>(status, HttpStatus.OK);

	}

}