package com.dao;

import com.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
    public List<User> selectAll();
    public User findUserByNameAndPsd(@Param("username") String name,@Param("password") String password );

}
