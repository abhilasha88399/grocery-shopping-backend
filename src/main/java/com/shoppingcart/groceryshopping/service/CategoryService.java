package com.shoppingcart.groceryshopping.service;

import java.util.List;

import com.shoppingcart.groceryshopping.model.*;

public interface CategoryService {
	
	Category getById(int id);
	
	List<Category> getAll();
	
	Category add(Category category);
	
	Category update(int categoryId, Category category);
	
	void delete(int categoryId);
	
	

}
