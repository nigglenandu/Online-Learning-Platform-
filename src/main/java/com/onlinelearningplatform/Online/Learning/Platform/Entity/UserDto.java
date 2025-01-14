package com.onlinelearningplatform.Online.Learning.Platform.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
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
}
