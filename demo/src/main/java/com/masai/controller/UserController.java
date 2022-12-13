package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EventException;
import com.masai.exception.UserException;
import com.masai.model.CurrentuserSesson;
import com.masai.model.Event;
import com.masai.model.LoginDto;
import com.masai.model.User;
import com.masai.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/masaiclender")
public class UserController {
	
	@Autowired
	public UserService uservice;
	
	
	@PostMapping("/regiser")
	public ResponseEntity<User> registerUser(@Valid @RequestBody User user) throws UserException{
		User ruser=uservice.registerUser(user);
		return new ResponseEntity<User>(ruser,HttpStatus.ACCEPTED);
		
	}
	
	@PostMapping("login")
	public ResponseEntity<CurrentuserSesson> LoginUser(@RequestBody LoginDto lginobject) throws UserException{
		
		CurrentuserSesson cuser=uservice.Loginuser(lginobject);
		return new ResponseEntity<CurrentuserSesson>(cuser,HttpStatus.ACCEPTED);
		
		
	}
	
	@PostMapping("/logout/{key}")
	public ResponseEntity<String> logOutUser(@PathVariable String key) throws UserException{
		
		String result=uservice.Logout(key);
		return new ResponseEntity<String>(result,HttpStatus.OK);
		
	}
	
	@GetMapping("/event/{type}")
	public ResponseEntity<List<Event>> FindEventByType(@PathVariable String type) throws EventException{
		
		List<Event> events=uservice.getAllEvent(type);
		return new ResponseEntity<List<Event>>(events,HttpStatus.OK);
		
	}
 
}
