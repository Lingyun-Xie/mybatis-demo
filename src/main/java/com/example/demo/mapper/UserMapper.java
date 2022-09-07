package com.example.demo.mapper;

import com.example.demo.model.User;

import java.util.List;

public interface UserMapper {
    List<User> getAllUsers();

    List<User> getUserById(Integer id);
}
