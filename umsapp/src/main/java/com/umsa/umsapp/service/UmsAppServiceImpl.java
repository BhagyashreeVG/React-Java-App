package com.umsa.umsapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umsa.umsapp.dao.UmsAppRepo;
import com.umsa.umsapp.dto.UserDTO;
import com.umsa.umsapp.entity.User;

@Service
public class UmsAppServiceImpl implements UmsAppService{
	@Autowired
	UmsAppRepo repo;

	@Override
	public List<User> getAllUsers() {
		return repo.findAll();
	}

	@Override
	public User addUser(UserDTO userDto) {
		User user = new User(userDto);
		return repo.save(user);
	}

	@Override
	public User getUserById(int userId) {	
		return repo.findById(userId).get();
	}

	@Override
	public void deleteUserById(int userId) {
		 repo.deleteById(userId);
	}

	@Override
	public User editUser(int id, UserDTO userdto) {
		User userToEdit;
		userToEdit = repo.findById(id).get();
		userToEdit.setEmail(userdto.getEmail());
		userToEdit.setName(userdto.getName());
		userToEdit.setUsername(userdto.getUsername());
		userToEdit.setPhone(userdto.getPhone());
		return repo.save(userToEdit);
	}
}
