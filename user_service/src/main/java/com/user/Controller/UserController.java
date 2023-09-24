package com.user.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.User;
import com.user.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	//http://localhost:9001/user/1311
	
	@GetMapping("/{userid}")
	public User getUser(@PathVariable("userid") Long userid) {
		
	
		
	User user = userservice.getUser(userid);
	
	List contact = restTemplate.getForObject( "http://CONTACT-SERVICE/contact/" + user.getUserId() , List.class);
	
	
	user.setContacts(contact);
	
	return user;
	} 
	
}
