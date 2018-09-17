package com.lishch.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lishch.dao.UserDao;
import com.lishch.model.User;
import com.lishch.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User findUserById(int userId) {
    	User user = userDao.findUserById(userId);
        return user;
    }
}
