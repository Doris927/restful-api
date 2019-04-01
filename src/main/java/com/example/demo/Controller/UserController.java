package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;

    }

    @RequestMapping("/")
    public String Index() {
        return userService.select("TaroYamada").getNickname();
    }

    @RequestMapping("/list")
    public List<User> List() {
        return userService.selectAll();
    }
}
