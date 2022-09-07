package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author linyun.xie
 */
@RestController
@AllArgsConstructor
public class DemoController {
    private UserMapper userMapper;

    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public List<User> getUserById(@PathVariable(value = "id") Integer id) {
        return userMapper.getUserById(id);
    }
}
