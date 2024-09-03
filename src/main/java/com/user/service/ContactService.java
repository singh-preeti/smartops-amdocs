package com.user.service;

import java.util.List;

import com.user.model.Contact;



public interface ContactService {

	public List<Contact> getContactsofCustomer(Long userId);
}
