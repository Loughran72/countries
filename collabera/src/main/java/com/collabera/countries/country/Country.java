package com.collabera.countries.country;

import org.springframework.stereotype.Component;

@Component
public class Country {
	String name;
	Long population;
	String capital;
	
	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + ", capital=" + capital + "]";
	}
	
	public Country() {
		
	}
	
	public Country(String name, Long population, String capital) {
	super();
	this.name = name;
	this.population = population;
	this.capital = capital;
}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPopulation() {
		return population;
	}
	public void setPopulation(Long population) {
		this.population = population;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
}
