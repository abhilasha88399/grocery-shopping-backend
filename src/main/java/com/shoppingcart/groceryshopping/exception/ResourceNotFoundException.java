package com.shoppingcart.groceryshopping.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	private String resourceName;
	private String fieldName;
	private String fieldValue;
	
	public ResourceNotFoundException(String resourceName, String fieldName, String productName) {
		super(resourceName+" Not found with "+fieldName+" = "+productName ); //Product not found with Id = 107
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = productName;
	}

	public ResourceNotFoundException(String resourceName2, String fieldName2, int categoryId) {
		
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}
	
	
	
	

}
