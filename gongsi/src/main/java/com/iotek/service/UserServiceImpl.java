package com.iotek.service;

import com.iotek.dao.UserDao;
import com.iotek.model.User;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
@Service
public class UserServiceImpl implements  UserService{
    @Resource
    private UserDao userDao;
    
    public User getUser(User user) {
        return userDao.getUser(user);
    }
}
