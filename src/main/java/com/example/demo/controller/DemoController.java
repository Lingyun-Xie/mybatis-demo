package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class DemoController {
    private UserMapper userMapper;

    @GetMapping("/hello")
    public List<User> getAllUsers() {
        List<User> users = userMapper.selectUserList();
        return users;
    }
}
