package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.Contact;
import com.user.service.ContactService;



@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactService contactservice;
	
	@GetMapping("/user/{userId}")
	public List<Contact> getContact(@PathVariable("userId") Long userId)
	{
		return this.contactservice.getContactsofCustomer(userId);
	}


}
