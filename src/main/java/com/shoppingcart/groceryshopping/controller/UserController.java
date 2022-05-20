
package com.shoppingcart.groceryshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.groceryshopping.model.User;
import com.shoppingcart.groceryshopping.service.UserService;
import com.shoppingcart.groceryshopping.service.UserServiceImpl;


@RestController
@RequestMapping("/grocery-shopping")
@CrossOrigin(origins= {"http://localhost:4200"})
public class UserController {

	@Autowired
	private UserService registerService;
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) throws Exception 
	{
		return registerService.registerUser(user);
	}
	
	@GetMapping("/getuser/user-id/{Id}")
	public User getUser(@PathVariable Integer Id)
	{
		return registerService.getUser(Id);
	}
	
	
	@PostMapping("/login")
	public User loginUser(@RequestBody User user)
	
	{
		String emailId=user.getEmailId();
		String password=user.getPassword();
		User userObj=null;
		if(emailId!=null && password!=null) {
			userObj=registerService.loginUser(emailId, password);
		}
	
		return userObj;
	}
	
	/*@DeleteMapping("/removeallusers")
	public String removeAllUsers()
	{
		registerService.removeAllUsers();
		return "All Users Removed";
	}*/
	
	@DeleteMapping("/removeuser/{userId}")
	public boolean removeUser(@PathVariable Integer Id)
	{
		return registerService.removeUserById(Id); 
	}
}

