package com.nanda.firstrestapi.data.repo;

import org.springframework.data.repository.CrudRepository;

import com.nanda.firstrestapi.data.model.City;

public interface CityRepository extends CrudRepository<City, Integer> {

}
