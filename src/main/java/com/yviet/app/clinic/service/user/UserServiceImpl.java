package com.yviet.app.clinic.service.user;

import com.yviet.app.clinic.config.security.UserInfoDetails;
import com.yviet.app.clinic.config.security.jwt.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import com.yviet.app.clinic.config.security.jwt.JwtRequestFilter;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {
//    @Autowired
//    private PasswordEncoder encoder;

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        Optional<UserEntity> userEntity = repository.findByEmail(email);

        // Converting UserEntity to UserDetails
//        return userEntity.map(UserInfoDetails::new)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found "));
        return new UserInfoDetails();
    }

    @Override
    public String authenticateUser(String email, String password) {
//        try {
//            Optional<UserEntity> user = repository.findByEmail(email);
//            if (user != null && encoder.matches(password, user.get().getPassword())) {
//
//            }
//        } catch (Exception e) {
//            throw new Exception(e.getMessage());
//        }

        return jwtUtil.generateToken(email);
    }
}
