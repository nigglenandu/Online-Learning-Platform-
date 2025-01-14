package com.onlinelearningplatform.Online.Learning.Platform.Services;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.LoginDto;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.User;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.UserDto;

import java.util.List;

public interface IUserService {
    void registerUser(UserDto userDto);
    String authenticateUser(LoginDto loginDto);
    User getUserById(Long id);
    List<User> getAllUsers();

}
