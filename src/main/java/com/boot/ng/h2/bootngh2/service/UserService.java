package com.boot.ng.h2.bootngh2.service;

import java.util.List;

import com.boot.ng.h2.bootngh2.dto.UserDto;

/**
 * 
 * @author vickey
 *
 */
public interface UserService {
	UserDto getUserById(Integer userId);

	void saveUser(UserDto userDto);

	List<UserDto> getAllUsers();
}
