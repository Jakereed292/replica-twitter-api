package com.cooksystems.springassessmentsocialmediaapr2024team3.services;


import com.cooksystems.springassessmentsocialmediaapr2024team3.dtos.UserRequestDto;


import com.cooksystems.springassessmentsocialmediaapr2024team3.dtos.UserResponseDto;

import java.util.List;

public interface UserService {

    List<UserResponseDto> getAllActiveUsers();

    UserResponseDto getActiveUserByUsername(String username);

	UserResponseDto createUser(UserRequestDto userRequestDto);


}
