package com.example.demo.service;


import com.example.demo.Mapper.UserMapper;
import com.example.demo.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserMapper dao;

    @Autowired
    public UserService(UserMapper dao) {
        this.dao = dao;
    }

    public boolean insert(User model) {
        return dao.insert(model);
    }

    public User select(String user_id) {
        return dao.select(user_id);
    }

    public List<User> selectAll() {
        return dao.selectAll();
    }

}