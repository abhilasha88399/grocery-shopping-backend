
package com.shoppingcart.groceryshopping.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.shoppingcart.groceryshopping.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	//public User findByEmailId(String emailId);
	
public User getUserByUserName(String userName);
	
	public User getUserByPhoneNumber(BigInteger contactNumber);
	
	public User getUserByEmailId(String emailId);
	
    public User getUserByemailIdAndPassword(String emailId,String userPassword);
}