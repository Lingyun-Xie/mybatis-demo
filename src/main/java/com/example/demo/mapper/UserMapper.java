package com.example.demo.mapper;

import com.example.demo.model.User;

import java.util.List;

public interface UserMapper {
    List<User> getUsers();

    List<User> getUserById(Integer id);

    void save(User user);
}
