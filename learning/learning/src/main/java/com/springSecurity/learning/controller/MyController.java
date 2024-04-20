package com.springSecurity.learning.controller;

import com.springSecurity.learning.entity.User;
import com.springSecurity.learning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @GetMapping("/home")
    public String homePage(){
        return "home";
    }

    @GetMapping("/user/home")
    public String userPage(){
        return "home_user";
    }

    @GetMapping("/admin/home")
    public String adminPage(){
        return "home_admin";
    }
}
