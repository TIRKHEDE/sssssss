package com.onlineShopping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineShopping.Model.User;
import com.onlineShopping.Service.IUser;
@RestController
public class ShoppingController 
{
	@Autowired
	IUser service;
	
	
	@DeleteMapping("/deleteProfile/{id}")
	  public ResponseEntity<User> deleteProduct(@PathVariable("id") int id)
	{
		System.out.println("alll");
	  User p=service.deleteById(id);
	  return new ResponseEntity<User>(p,HttpStatus.OK); // Products p =
	 // service.deleteProducts(products);
	  }
}
