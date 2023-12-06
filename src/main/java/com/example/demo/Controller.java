package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        System.out.println(user.toString());
        return user;
    }
}
