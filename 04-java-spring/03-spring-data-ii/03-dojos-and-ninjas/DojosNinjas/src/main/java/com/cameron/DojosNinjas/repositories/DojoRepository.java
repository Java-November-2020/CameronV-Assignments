package com.cameron.DojosNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cameron.DojosNinjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();
}
