package com.service.Impl;

import com.dao.UserDao;
import com.entity.User;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("buser")
public class UserService implements IUserService {
     @Autowired
     private UserDao userDao;
    public User login(String username, String password) {
         return userDao.findUserByNameAndPsd(username,password);
    }
}
