package com.shoppingcart.groceryshopping.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcart.groceryshopping.exception.IdNotFoundException;
import com.shoppingcart.groceryshopping.exception.NullObjectException;
import com.shoppingcart.groceryshopping.model.User;

import com.shoppingcart.groceryshopping.repository.UserRepository;



@Service
public class UserServiceImpl implements UserService{





		
		@Autowired
		private UserRepository registerRepo;
//		@Autowired
//		private Random random;
		
		String errorMessage=" is Already Exist";
		
		@Override
		public User registerUser(User user) {
			
//			user.setUserId(random.nextInt(1000000));
			/*if(registerRepo.getUserByUserName(user.getUserName())!=null)
				throw new Exception("User with Name "+user.getUserName()+errorMessage);
			
			if(registerRepo.getUserByPhoneNumber(user.getPhoneNumber())!=null)
				throw new Exception("User with ContactNumber "+user.getPhoneNumber()+errorMessage);
			
			if(registerRepo.getUserByUserName(user.getUserName())!=null)
				throw new Exception("User with Email "+user.getUserName()+errorMessage);*/
			return registerRepo.save(user);
		}
        @Override
		public User getUser(Integer userId) {
			
        	User user = null;
    		Optional<User> opt = registerRepo.findById(userId);
    		if(opt.isEmpty()) {
    			throw new IdNotFoundException("User with Id "+userId+" is not found");
    		}
    		else {
    			user = opt.get();
    		}
    		return user;
		
		}
      /*  @Override
		public User loginUser(String userName, String userPassword) {
	        
		         User user=registerRepo.getUserByUserNameAndPassword(userName, userPassword);
		         System.out.println(user.getFirstName());
			//if (user == null) {
				//throw new UserNotFoundException("Invalid UserName and Password");
			//}
		         
			 return user;
			 
		}*/
          @Override
        	public User loginUser(String emailId, String password)  {
        	  System.out.println(emailId);
        	   User user=registerRepo.getUserByemailIdAndPassword(emailId, password);
        	   //System.out.println(user.getFirstName());

        		if (user == null) {
        			throw new NullObjectException("Invalid UserName and Password");
        		}
        		 System.out.println(user.getFirstName());
        		 return user;
        	}
         
       /* @Override
		public boolean removeAllUsers() {
			registerRepo.deleteAll();
			return registerRepo.findAll().;
		}*/
        @Override
		public boolean removeUserById(Integer userId) {
			registerRepo.deleteById(userId);
			return true;
		}

	}

