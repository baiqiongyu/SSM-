package com.service;

import com.entity.User;

public interface IUserService {
    public User login(String username, String password);
}
