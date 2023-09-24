package com.contact.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.ContactService;



@RestController
@RequestMapping("/contact")
public class ContactController {

	
	@Autowired
	private ContactService contactservice;
	
	@GetMapping("{userid}")
	public List<Contact> getContactList (@PathVariable("userid") Long userid ){
		return contactservice.getuserContact(userid);
	}
}
