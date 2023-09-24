package com.contact.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceIMPL implements ContactService{

	List<Contact> list = List.of(
				new Contact(01L, "sam@gmail.com", "Sameer" , 1311L ),
				new Contact(02L, "sam1@gmail.com", "Sameer1" , 1311L ),
				
				new Contact(03L, "John@gmail.com", "John" , 1312L ),
				new Contact(04L, "John1@gmail.com", "John1" , 1312L ),
				
				
				new Contact(05L, "jack@gmail.com", "jack" , 1313L ),
				new Contact(06L, "jack@gmail.com", "jack" , 1313L ),
				
				new Contact(07L, "Mark@gmail.com", "Mark" , 1314L ),
				new Contact(8L, "Mark@gmail.com", "Mark" , 1314L )
				
			);
	
	
	@Override
	public List<Contact> getuserContact(Long userId) {
	
		return list.stream().filter(c -> c.getUserId().equals(userId)).toList();
	}
	

}
