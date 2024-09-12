package com.yviet.app.clinic.config.security;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserInfoDetails implements UserDetails {

    private final String username;
    private final String password;
    private final List<GrantedAuthority> authorities;

    public UserInfoDetails() {
        username = "hung";
        password = "123";
        authorities = new ArrayList<>();
//        username = userInfo.getEmail();
//        password = userInfo.getPassword();

//        authorities =  List.of(userInfo.getRoles().split(","))
//                .stream()
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toList());
//
//        System.err.println(authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }



}
