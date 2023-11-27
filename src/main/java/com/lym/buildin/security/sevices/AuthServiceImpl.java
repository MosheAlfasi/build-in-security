package com.lym.buildin.security.sevices;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(Authentication authentication) {
        return "User: " + authentication.getName() + " logged in successfully";
    }

    @Override
    public String authenticate(Authentication authentication) {
        return "User: " + authentication.getName() + " authenticated successfully";
    }
}
