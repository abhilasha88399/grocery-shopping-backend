package com.shoppingcart.groceryshopping.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcart.groceryshopping.model.*;
import com.shoppingcart.groceryshopping.service.*;
import com.shoppingcart.groceryshopping.repository.*;
import com.shoppingcart.groceryshopping.exception.*;


@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepo;
	

	@Override
	public Category getById(int id) {
		Category category = null;
		Optional<Category> opt = categoryRepo.findById(id);
		if(opt.isEmpty()) {
			throw new ResourceNotFoundException("Category", "Category Id", id);
		}
		else {
			category = opt.get();
		}
		return category;
		
	}

	@Override
	public List<Category> getAll() {
		List<Category> categories = new ArrayList<Category>();
		Iterable<Category> it = categoryRepo.findAll();
		it.forEach((category) -> {
			categories.add(category);
		});
		return categories;
	}

	@Override
	public Category add(Category category) {
		if(category == null) {
			throw new NullObjectException("Category");
		}
		return categoryRepo.save(category);
	}

	@Override
	public Category update(int categoryId, Category category) {
		if(category == null) {
			throw new NullObjectException("Category");
		}
		
		Optional<Category> opt = categoryRepo.findById(categoryId);
		if(opt.isEmpty()) {
			throw new ResourceNotFoundException("Category", "Category Id", categoryId);
		}
		Category cat = categoryRepo.save(category);
		
		return cat;	
	}

	@Override
	public void delete(int categoryId) {
		Optional<Category> opt = categoryRepo.findById(categoryId);
		if(opt.isEmpty()) {
			throw new ResourceNotFoundException("Category", "Category Id", categoryId);
		}
		categoryRepo.delete(new Category(categoryId,""));

	}

}
