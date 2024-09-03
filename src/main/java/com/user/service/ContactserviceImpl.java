package com.user.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.user.model.Contact;



@Service
public class ContactserviceImpl implements ContactService {
	//
	List<Contact> list = List.of(
			new Contact(1L,"singhpreety217@gmail.com","Preety",101L),
			new Contact(2L,"Sumit217@gmail.com","Sumit",102L));

	
	@Override
	public List<Contact> getContactsofCustomer(Long userId) {
		
		return list.stream().filter(contact -> contact .getUserId().equals(userId))
				.collect(Collectors.toList());
	}
	
	
	

}
