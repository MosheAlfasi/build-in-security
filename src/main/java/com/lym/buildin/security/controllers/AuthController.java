package com.lym.buildin.security.controllers;

import com.lym.buildin.security.sevices.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("authentication")
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String login(Authentication authentication) {
        return authService.login(authentication);
    }

    @PostMapping(value = "/auth", consumes = MediaType.ALL_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String authenticate(Authentication authentication) {
        return authService.authenticate(authentication);
    }
}

