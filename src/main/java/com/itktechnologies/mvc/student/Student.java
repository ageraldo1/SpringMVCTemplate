package com.itktechnologies.mvc.student;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private Map<String,String> countryOptions = new LinkedHashMap<>();
	private Map<String,String> favoriteLanguageOptions = new LinkedHashMap<>();
	private String favoriteLanguage;
	private String[] operationSystems;
	
	public Student() {
		this.firstName = null;
		this.lastName = null;
		this.country = null;
		this.favoriteLanguage = null;
		this.operationSystems = null;
		
		this.countryOptions.put("BR", "Brazil");
		this.countryOptions.put("FR", "France");
		this.countryOptions.put("DE", "Germany");
		this.countryOptions.put("IN", "India");
		this.countryOptions.put("US", "United States of America");
		
		this.favoriteLanguageOptions.put("java", "Java");
		this.favoriteLanguageOptions.put("c#", "C Sharp");
		this.favoriteLanguageOptions.put("php", "PHP");
		this.favoriteLanguageOptions.put("ruby", "Ruby");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public Map<String,String> getCountryOptions() {
		return this.countryOptions;
	}
	
	public Map<String,String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}
	
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	public String[] getOperationSystems() {
		return operationSystems;
	}

	public void setOperationSystems(String[] operationSystems) {
		this.operationSystems = operationSystems;
	}	

}
