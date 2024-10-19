package com.basel.book.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegisterRequest {
    @NotEmpty(message = "Firstname is required")
    @NotBlank(message = "Firstname is required")
    private String firstname;

    @NotEmpty(message = "Lastname is required")
    @NotBlank(message = "Lastname is required")
    private String lastname;

    @Email(message = "Email is not valid")
    @NotEmpty(message = "Email is required")
    @NotBlank(message = "Email is required")
    private String email;

    @NotEmpty(message = "Password is required")
    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be 8 characters at least")
    private String password;
}