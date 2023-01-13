package com.umsa.umsapp.service;

import java.util.List;

import com.umsa.umsapp.dto.UserDTO;
import com.umsa.umsapp.entity.User;

public interface UmsAppService {

	List<User> getAllUsers();

	User addUser(UserDTO user);

	User getUserById(int userId);

	void deleteUserById(int userId);

	User editUser(int id, UserDTO user);

}
