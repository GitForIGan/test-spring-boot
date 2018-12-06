package com.example.dao;

import com.example.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User getUserInfo(Integer emp_no);

}
