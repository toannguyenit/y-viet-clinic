package com.yviet.app.clinic.controller;

import com.yviet.app.clinic.service.user.UserService;
import com.yviet.app.clinic.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password) {

        return  userService.authenticateUser(email,password);


    }

}
