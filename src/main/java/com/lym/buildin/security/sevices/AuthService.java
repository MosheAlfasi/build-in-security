package com.lym.buildin.security.sevices;


import org.springframework.security.core.Authentication;

public interface AuthService {
    String login(Authentication authentication);

    String authenticate(Authentication authentication);
}
