package com.yviet.app.clinic.service.user;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService  {
    String authenticateUser(String email, String password);
}
