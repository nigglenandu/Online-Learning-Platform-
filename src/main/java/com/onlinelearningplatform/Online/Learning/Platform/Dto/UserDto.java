package com.onlinelearningplatform.Online.Learning.Platform.Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @NotNull(message = "Username is required")
    @Size(min=1, message = "Username cannot be empty")
    private String username;

    @NotNull(message = "Email is required")
    @Email(message = "email should be valid")
    @Size(min = 1, message = "Email cannot be empty")
    private String email;

    @NotNull(message = "Password is required")
    @Size(min = 6, message = "Password should have at least 6 characters")
    private String password;

    @NotNull(message = "Role is required")
    @Size(min = 1, message = "Role cannot be empty")
    private String role;

    public @NotNull(message = "Email is required") @Email(message = "email should be valid") @Size(min = 1, message = "Email cannot be empty") String getEmail() {
        return email;
    }

    public void setEmail(@NotNull(message = "Email is required") @Email(message = "email should be valid") @Size(min = 1, message = "Email cannot be empty") String email) {
        this.email = email;
    }

    public @NotNull(message = "Password is required") @Size(min = 6, message = "Password should have at least 6 characters") String getPassword() {
        return password;
    }

    public void setPassword(@NotNull(message = "Password is required") @Size(min = 6, message = "Password should have at least 6 characters") String password) {
        this.password = password;
    }

    public @NotNull(message = "Role is required") @Size(min = 1, message = "Role cannot be empty") String getRole() {
        return role;
    }

    public void setRole(@NotNull(message = "Role is required") @Size(min = 1, message = "Role cannot be empty") String role) {
        this.role = role;
    }

    public @NotNull(message = "Username is required") @Size(min = 1, message = "Username cannot be empty") String getUsername() {
        return username;
    }

    public void setUsername(@NotNull(message = "Username is required") @Size(min = 1, message = "Username cannot be empty") String username) {
        this.username = username;
    }
}
