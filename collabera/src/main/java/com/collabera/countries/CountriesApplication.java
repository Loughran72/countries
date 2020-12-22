package com.collabera.countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.collabera.countries.service.CountryService;

@SpringBootApplication
public class CountriesApplication {
	
    public static void main( String[] args ) {
        SpringApplication.run(CountriesApplication.class, args);
        CountryService.generateCountryData();
    }
}
