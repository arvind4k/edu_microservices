package com.talooz.ms.profiles.controller;

import java.util.Date;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.talooz.ms.profiles.dao.UserRepository;
import com.talooz.ms.profiles.entity.User;

@RestController
@RequestMapping("/users")
public class UserController {
	private UserRepository userRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public UserController(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.userRepository = userRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@RequestMapping(value = "/sign-up", method = RequestMethod.POST)
	public User signUp(@RequestBody User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setCreationDate(new Date());
		user.setProfileComplete(Integer.valueOf(0));
		userRepository.save(user);
		return user;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public User saveUser(@RequestBody User user) {
		if(null==user.getUserId()) {
			user.setCreationDate(new Date());			
		}
		user.setUpdationDate(new Date());
		user.setProfileComplete(Integer.valueOf(1));
		userRepository.save(user);
		return user;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody User getUser(@PathVariable("userId") Long userId) {
		return userRepository.findOne(userId);
	}
}
