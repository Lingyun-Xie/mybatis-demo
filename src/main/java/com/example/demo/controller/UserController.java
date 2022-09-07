package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private UserMapper userMapper;

    @GetMapping
    public List<User> qureyAllUsers() {
        return userMapper.queryAllUsers();
    }

    @PostMapping
    public String saveUser(@RequestBody User user) {
        userMapper.saveUser(user);
        return "insert user success";
    }

    @GetMapping("/{id}")
    public User queryUserById(@PathVariable(value = "id") Integer id) {
        return userMapper.queryUserById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable(value = "id") Integer id) {
        userMapper.deleteUserById(id);
        return "delete user success";
    }

    @GetMapping("/filter")
    public List<User> queryUserByName(@RequestParam(value = "username") String userName) {
        return userMapper.queryUserByName(userName);
    }
}
