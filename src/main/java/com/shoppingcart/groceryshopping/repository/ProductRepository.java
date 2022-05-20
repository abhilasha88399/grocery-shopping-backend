package com.shoppingcart.groceryshopping.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.shoppingcart.groceryshopping.model.*;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	
	/*
	@Query("select p from Product p where p.category.categoryId = :catId")
	List<Product> getAllByCategory(@Param("catId")int catId);
	*/
	
	 public List<Product> findAllByCategoryCategoryId(int categoryId);
	 //public List<Product> findById(int productId);
	 //public Optional<Product> findByProductName(String productName);
	
	
	
}