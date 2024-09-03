package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.User;
@Service
public class UserServivceImpl implements UserService {

	//fake list of user
	@Autowired
	private ContactService contactService;
	
	List<User> list = List.of(
			new User(101L,"Lee","89898989"),
			new User(102L,"John","89675646"),
			new User(103L,"Johnson","89898989"),
			new User(104L,"Sameer","89675646")
			);
	@Override
	public User getUser(Long id) {
		
		Optional<User> user = this.list.stream()
				.filter(usr -> 
				usr.getUserId()
				.equals(id))
				.findAny();
		
	user.ifPresent(u -> u.setContact(contactService.getContactsofCustomer(id)));
	return user.orElse(null);
		
// 		return this.list.stream()
//				.filter(user -> 
//				user.getUserId()
//				.equals(id))
//				.findAny().orElse(null);
	}

}
