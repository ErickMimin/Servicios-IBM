package com.microservice.training.countriesdemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.training.countriesdemo.model.entity.CountryEntity;
import com.microservice.training.countriesdemo.service.api.ICountriesService;

@RestController
public class CountriesController{
	
	@Autowired
	private ICountriesService countriesService;
	
	@GetMapping("/api/countries/continent/name/{continentName}")
	  public ResponseEntity<List<CountryEntity>> findCountryByContinent(@PathVariable String continentName) {
	    return new ResponseEntity<List<CountryEntity>>(
	        countriesService.findCountriesByContinentName(continentName), HttpStatus.OK);
	  }
	  
	  @GetMapping("/api/countries/continent/id/{countryId}")
	  public ResponseEntity<CountryEntity> findCountry(@PathVariable Integer countryId) {
	    return new ResponseEntity<CountryEntity>(
	        countriesService.findCountriesById(countryId), HttpStatus.OK);
	  }
	  
	  
	  @PostMapping("/api/countries/new")
	  public ResponseEntity<CountryEntity> postCountry(@Valid @RequestBody CountryEntity country){
		  CountryEntity ce = countriesService.newCountry(country);
	       return new ResponseEntity<CountryEntity>( ce, HttpStatus.CREATED);
	}
}

