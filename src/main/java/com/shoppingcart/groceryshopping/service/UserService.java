
package com.shoppingcart.groceryshopping.service;

import com.shoppingcart.groceryshopping.model.User;

public interface UserService {

User registerUser(User user) throws Exception;
	
	User getUser(Integer userId);
	
	
	User loginUser(String emailId,String password); 
	

	//boolean removeAllUsers();
	
	boolean removeUserById(Integer userId);
}
