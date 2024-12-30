package com.chen.springboot.service;

import com.chen.springboot.entity.User;
import com.chen.springboot.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UsersMapper usersMapper;

    public List<User> getAllUsers() {
        return usersMapper.getAllUsers();
    }

    public User getUserById(int userId) {
        return usersMapper.getUserById(userId);
    }

    public void createUser(User user) {
        usersMapper.createUser(user);
    }

    public void updateUser(User user) {
        usersMapper.updateUser(user);
    }

    public void deleteUser(int userId) {
        usersMapper.deleteUser(userId);
    }
}



