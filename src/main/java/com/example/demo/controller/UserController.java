package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author linyun.xie
 */
@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private UserMapper userMapper;

    @GetMapping
    public List<User> getUsers() {
        return userMapper.getUsers();
    }

    @GetMapping("/{id}")
    public List<User> getUserById(@PathVariable(value = "id") Integer id) {
        return userMapper.getUserById(id);
    }

    @PostMapping
    public String saveUser(@RequestBody User user) {
        userMapper.save(user);
        return "success";
    }
}
