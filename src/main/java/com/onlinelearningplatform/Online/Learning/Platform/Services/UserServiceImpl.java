package com.onlinelearningplatform.Online.Learning.Platform.Services;

import com.onlinelearningplatform.Online.Learning.Platform.Entity.LoginDto;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.User;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.UserDto;
import com.onlinelearningplatform.Online.Learning.Platform.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        userRepository.save(user);
        return user;
    }

    @Override
    public Optional<User> authenticateUser(LoginDto loginDto) {
        return Optional.ofNullable(userRepository.findByEmailAndPassword(loginDto.getEmail(), loginDto.getPassword()));
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
