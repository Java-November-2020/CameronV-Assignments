package com.cameron.ProductsCategoriesApplication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cameron.ProductsCategoriesApplication.models.Association;

@Repository
public interface AssociationRepository extends CrudRepository<Association, Long>{

}
