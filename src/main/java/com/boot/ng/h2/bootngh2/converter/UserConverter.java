package com.boot.ng.h2.bootngh2.converter;

import java.util.stream.Collectors;

import com.boot.ng.h2.bootngh2.dto.UserDto;
import com.boot.ng.h2.bootngh2.entity.User;

/**
 * 
 * @author vickey
 *
 */
public class UserConverter {
	
	private UserConverter() {
	}
	
	public static User dtoToEntity(UserDto userDto) {
		User user = new User(userDto.getUserName(), null);
		user.setUserId(userDto.getUserId());
		user.setSkills(userDto.getSkillDtos().stream().map(SkillConverter::dtoToEntity).collect(Collectors.toList()));
		return user;
	}

	public static UserDto entityToDto(User user) {
		UserDto userDto = new UserDto(user.getUserId(), user.getUserName(), null);
		userDto.setSkillDtos(user.getSkills().stream().map(SkillConverter::entityToDto).collect(Collectors.toList()));
		return userDto;
	}
}
