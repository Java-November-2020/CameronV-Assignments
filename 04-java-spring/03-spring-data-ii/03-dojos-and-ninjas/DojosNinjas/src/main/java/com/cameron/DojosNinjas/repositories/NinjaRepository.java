package com.cameron.DojosNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cameron.DojosNinjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
}
