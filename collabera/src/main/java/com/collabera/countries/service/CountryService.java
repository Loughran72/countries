package com.collabera.countries.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.collabera.countries.country.Country;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CountryService {

	private static ArrayList<Country> countries = new ArrayList<Country>();
	public static void generateCountryData() {
		countries.add(new Country("America", (long) 330737532, "Washington, D.C."));
		countries.add(new Country("France", (long) 2148271, "Paris"));
		countries.add(new Country("Canada", (long) 37902239, "Ottawa"));
		countries.add(new Country("China", (long) 1441992505, "Beijing"));
		countries.add(new Country("Costa Rica", (long) 5116634, "San Jose"));
		countries.add(new Country("Denmark", (long) 5801991, "Copenhagen"));
		countries.add(new Country("Egypt", (long) 103282684, "Cairo"));
		countries.add(new Country("Brazil", (long) 213288520, "Brasilia"));
		countries.add(new Country("Japan", (long) 126292498, "Tokyo"));
		countries.add(new Country("Ireland", (long) 4964567, "Dublin"));
	}
	
	public String convertToJson() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(countries);
			return jsonString;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "No Countries available";
	}
	
	private String convertToJson(ArrayList<Country> cntrs) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cntrs);
			return jsonString;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "No Countries available";
	}
	
	public String countriesPopAbove(int value) {
		ArrayList<Country> countriesWithPop = new ArrayList<Country>();
		for (int x=0; x<countries.size(); x++) {
			if (countries.get(x).getPopulation() >= value) {
				countriesWithPop.add(countries.get(x));
			}
		}
		String result = convertToJson(countriesWithPop);
		return result;
	}
	
	public String countriesPopBelow(int value) {
		ArrayList<Country> countriesWithPop = new ArrayList<Country>();
		for (int x=0; x<countries.size(); x++) {
			if (countries.get(x).getPopulation() < value) {
				countriesWithPop.add(countries.get(x));
			}
		}
		String result = convertToJson(countriesWithPop);
		return result;
	}
}
