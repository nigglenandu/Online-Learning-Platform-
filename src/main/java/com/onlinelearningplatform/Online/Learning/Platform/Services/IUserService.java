package com.onlinelearningplatform.Online.Learning.Platform.Services;

import com.onlinelearningplatform.Online.Learning.Platform.Dto.LoginDto;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.User;
import com.onlinelearningplatform.Online.Learning.Platform.Dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User registerUser(UserDto userDto);
    Optional<User> authenticateUser(LoginDto loginDto);
    Optional<User> getUserById(Long id);
    List<User> getAllUsers();

}
