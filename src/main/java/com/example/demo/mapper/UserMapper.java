package com.example.demo.mapper;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    List<User> queryAllUsers();

    User queryUserById(Integer id);

    void saveUser(User user);

    void deleteUserById(Integer id);

    @Select("select * from t_user where username = #{userName}")
    List<User> queryUserByName(String userName);

    void updateUserName(User user);
}
