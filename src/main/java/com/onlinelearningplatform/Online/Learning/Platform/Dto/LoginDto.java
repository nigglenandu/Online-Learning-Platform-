package com.onlinelearningplatform.Online.Learning.Platform.Dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class LoginDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @NotNull(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotNull(message = "Password is required")
    private String password;

    public @NotNull(message = "Email is required") @Email(message = "Email should be valid") String getEmail() {
        return email;
    }

    public void setEmail(@NotNull(message = "Email is required") @Email(message = "Email should be valid") String email) {
        this.email = email;
    }

    public @NotNull(message = "Password is required") String getPassword() {
        return password;
    }

    public void setPassword(@NotNull(message = "Password is required") String password) {
        this.password = password;
    }
}
