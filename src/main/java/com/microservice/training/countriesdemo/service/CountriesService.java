package com.microservice.training.countriesdemo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.training.countriesdemo.model.entity.CountryEntity;
import com.microservice.training.countriesdemo.repository.api.CountryJpaRepository;
import com.microservice.training.countriesdemo.service.api.ICountriesService;

@Service
public class CountriesService implements ICountriesService{
	
	@Autowired
	private CountryJpaRepository countryRepository;

	@Override
	public List<CountryEntity> findCountriesByContinentName(String continentName) {
		return (List<CountryEntity>) countryRepository.findContinentByContinent(continentName);
	}

	@Override
	public CountryEntity findCountriesById(Integer countryId) {
		return countryRepository.findById(countryId).get();
	}

	@Override
	public CountryEntity newCountry(CountryEntity country) {
		return countryRepository.save(country);
	}
	
	
	
}


