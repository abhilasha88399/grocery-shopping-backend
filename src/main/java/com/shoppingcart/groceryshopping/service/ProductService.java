package com.shoppingcart.groceryshopping.service;

import java.util.List;

import com.shoppingcart.groceryshopping.model.*;

public interface ProductService {

	List<Product> getAll();
	
	List<Product> getAllByCategory(int categoryId);

	//Product getProductByName(String productName);
	Product add(Product p);
	
	Product getById(int id);

	Product add(int categoryId, Product p);

	Product update(int productId, Product p);

	void delete(int id);

}