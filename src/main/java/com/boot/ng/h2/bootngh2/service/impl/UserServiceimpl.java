package com.boot.ng.h2.bootngh2.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.ng.h2.bootngh2.converter.UserConverter;
import com.boot.ng.h2.bootngh2.dto.UserDto;
import com.boot.ng.h2.bootngh2.repository.UserRepository;
import com.boot.ng.h2.bootngh2.service.UserService;

/**
 * 
 * @author vickey
 *
 */
@Service
public class UserServiceimpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto getUserById(Integer userId) {
		return UserConverter.entityToDto(userRepository.getOne(userId));
	}

	@Override
	public void saveUser(UserDto userDto) {
		userRepository.save(UserConverter.dtoToEntity(userDto));
	}

	@Override
	public List<UserDto> getAllUsers() {
		return userRepository.findAll().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
	}
}
