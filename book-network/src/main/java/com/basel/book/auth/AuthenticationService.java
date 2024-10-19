package com.basel.book.auth;

import jakarta.mail.MessagingException;

public interface AuthenticationService {
    void register(RegisterRequest registerRequest) throws MessagingException;
}
