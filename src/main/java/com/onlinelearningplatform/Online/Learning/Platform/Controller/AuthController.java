package com.onlinelearningplatform.Online.Learning.Platform.Controller;

import com.onlinelearningplatform.Online.Learning.Platform.Dto.LoginDto;
import com.onlinelearningplatform.Online.Learning.Platform.Entity.User;
import com.onlinelearningplatform.Online.Learning.Platform.Dto.UserDto;
import com.onlinelearningplatform.Online.Learning.Platform.Services.IUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AuthController {
    private final IUserService userService;

    public AuthController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@Valid @RequestBody UserDto userDto) {
        User user = userService.registerUser(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PostMapping("/login")
    public ResponseEntity<User> authenticateUser(@Valid @RequestBody LoginDto loginDto) {
        return userService.authenticateUser(loginDto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
    }
}