package com.example.demo.mapper;

import com.example.demo.model.User;

import java.util.List;

public interface UserMapper {
    List<User> queryAllUsers();

    User queryUserById(Integer id);

    void saveUser(User user);

    void deleteUserById(Integer id);
}
