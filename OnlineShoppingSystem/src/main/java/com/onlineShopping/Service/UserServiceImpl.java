package com.onlineShopping.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineShopping.Model.User;
import com.onlineShopping.Repository.UserRepo;

@Service("userRegistrationServiceImpl")
public class UserServiceImpl implements IUser
{
	@Autowired
	UserRepo dao;
	private User user_profile;


	@Override
	public User deleteById(int id) 
	{
		User use=dao.deleteByName(user_profile);
		return user_profile;
	}


	
	
	
}
