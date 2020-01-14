package com.ljl.community.dao;

import com.ljl.community.entity.User;

import java.util.List;

public interface UserDao {
    /**
     * 根据用户名密码查询用户
     * @param username
     * @param password
     * @return
     */
    User findByUsernameAndPassword(String username, String password);

    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    List<User> findByUsername(String username);
}
