package com.example.service;

import com.example.dao.UserDao;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;
    @Override
    public User getUserInfo(int usrId) {
        return userDao.getUserInfo(usrId);
    }
}
