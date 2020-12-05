package com.cameron.cars.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cameron.cars.models.car;

@Repository
public interface carRepositories extends CrudRepository<car, Long>{
	List<car> findAll();
}
