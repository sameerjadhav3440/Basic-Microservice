package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{

	
	List<User> list = List.of(
			
			new User(1311L,"Sameer","9698545698"),
			new User(1312L,"John","9698545698"),
			new User(1313L,"jack","9698545698"),
			new User(1314L,"Mark","9698545698")
			);
	
	
	@Override
	public User getUser(Long id) {
		
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
