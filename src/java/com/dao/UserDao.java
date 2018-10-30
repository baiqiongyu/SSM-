package com.dao;

import com.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
    public List<User> selectAll();
}
