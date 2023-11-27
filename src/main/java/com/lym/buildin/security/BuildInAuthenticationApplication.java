package com.lym.buildin.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@ComponentScan({"com.lym.buildin.security", "com.myl.buildin.libs" })
@EnableMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class BuildInAuthenticationApplication {
	public static void main(String[] args) {
		SpringApplication.run(BuildInAuthenticationApplication.class, args);
	}
}
