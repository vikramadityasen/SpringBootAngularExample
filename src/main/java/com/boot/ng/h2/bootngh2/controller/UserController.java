package com.boot.ng.h2.bootngh2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.boot.ng.h2.bootngh2.dto.UserDto;
import com.boot.ng.h2.bootngh2.service.UserService;
import com.boot.ng.h2.bootngh2.utils.Constants;

/**
 * 
 * @author vickey
 *
 */
@RequestMapping("/user")
@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(Constants.GET_USER_BY_ID)
	public UserDto getUserById(@PathVariable Integer userId) {
		return userService.getUserById(userId);
	}

	@GetMapping(Constants.GET_ALL_USERS)
	public List<UserDto> getAllUsers() {
		return userService.getAllUsers();
	}

	@PostMapping(value = Constants.SAVE_USER)
	public void saveUser(@RequestBody UserDto userDto) {
		userService.saveUser(userDto);
	}
}
