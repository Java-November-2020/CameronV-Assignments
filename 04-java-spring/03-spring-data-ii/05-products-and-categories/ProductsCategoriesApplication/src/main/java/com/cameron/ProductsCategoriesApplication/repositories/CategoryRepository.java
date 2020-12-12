package com.cameron.ProductsCategoriesApplication.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cameron.ProductsCategoriesApplication.models.Category;
import com.cameron.ProductsCategoriesApplication.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long	>{
	List<Category> findAll();
	List<Category> findByProductsNotContains(Product product);
}
