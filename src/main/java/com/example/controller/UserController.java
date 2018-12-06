package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import javax.servlet.http.HttpServletRequest ;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getUserInfo")
    User getUserInfo(HttpServletRequest request){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserInfo(userId);
        System.out.println("hahha__________-------------"+user.toString());
        return user;
    }
}
