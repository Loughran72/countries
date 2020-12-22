package com.collabera.countries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.countries.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {
	@Autowired
	CountryService service;

	@GetMapping("all")
	public String listAll() {
		return service.convertToJson();
	}
	
	@GetMapping("population-above/{value}")
	public String listPopAboveP(@PathVariable int value) {
		return service.countriesPopAbove(value);
	}
	
	@GetMapping("population-above")
	public String listPopAboveR(@RequestParam int value) {
		return service.countriesPopAbove(value);
	}
	
	@GetMapping("population-below/{value}")
	public String listPopBelowP(@PathVariable int value) {
		return service.countriesPopBelow(value);
	}
	
	@GetMapping("population-below")
	public String listPopBelowR(@RequestParam int value) {
		return service.countriesPopBelow(value);
	}
}
