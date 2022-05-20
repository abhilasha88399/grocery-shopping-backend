package com.shoppingcart.groceryshopping.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.shoppingcart.groceryshopping.repository.*;

import com.shoppingcart.groceryshopping.exception.*;

import com.shoppingcart.groceryshopping.model.*;

import com.shoppingcart.groceryshopping.service.*;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private CategoryRepository categoryRepo;
	
	
	@Override
	public List<Product> getAll() {
		List<Product> products = new ArrayList<Product>();
		Iterable<Product> it = productRepo.findAll();
		it.forEach((product) -> {
			products.add(product);
		});
		return products;	
	}
	

	@Override
	public Product getById(int id) {
		Product product = null;
		Optional<Product> opt = productRepo.findById(id);
		if(opt.isEmpty()) {
			throw new ResourceNotFoundException("Product", "Product Id", id);
		}
		else {
			product = opt.get();
		}
		return product;
	}
	@Override
	public Product add(Product product) {
		if(product==null) {
			throw new NullObjectException("Product");
		}
		return productRepo.save(product);
	}
	
	@Override
	public Product add(int categoryId, Product product) {
		if(product == null) {
			throw new NullObjectException("Product");
		}
		
		Category category = null;
		Optional<Category> opt = categoryRepo.findById(categoryId);
		if(opt.isEmpty()) {
			throw new ResourceNotFoundException("Category", "Category Id", categoryId);
		}
		
		category = opt.get();
		product.setCategory(category);
		return productRepo.save(product);
	} 
	
	@Override
	public Product update(int productId, Product p) {
		if(p == null) {
			throw new NullObjectException("Product");
		}
		
		Optional<Product> opt = productRepo.findById(productId);
		if(opt.isEmpty()) {
			throw new ResourceNotFoundException("Product", "Product Id", productId);
		}
		Product prod = productRepo.save(p);
		
		return prod;	
	}
	
	/*@Override
	public Boolean delete(int id) {
		Optional<Product> opt = productRepo.findById(id);
		if(opt.isEmpty()) {
			throw new ResourceNotFoundException("Product", "Product Id", id);
		}
		
		return productRepo.delete(new Product());
		 
	}
	@Override*/
	public void delete(int id) {
		Optional<Product> opt = productRepo.findById(id);
		if(opt.isEmpty()) {
			throw new ResourceNotFoundException("Product", "Product Id", id);
		}
		productRepo.delete(new Product(0,"","",0, "",""));
	}
	/*
	@Override
	public Boolean delete(int id) {

		productRepo.deleteById(id);
		return !productRepo.existsById(Product.getProductId());

	}*/

	@Override
	public List<Product> getAllByCategory(int categoryId) {
		
		Category category = null;
		Optional<Category> opt = categoryRepo.findById(categoryId);
		if(opt.isEmpty()) {
			throw new ResourceNotFoundException("Category", "Category Id", categoryId);
		}
		
		category = opt.get();
		List<Product> products = productRepo.findAllByCategoryCategoryId(categoryId);
		
		return products;
		
		
	}
	
	

}