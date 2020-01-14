package com.ljl.community.service;

import com.ljl.community.entity.User;

import java.util.List;

public interface UserService {
    /**
     * 根据id查询
     * @param id
     * @return
     */
    User findById(int id);

    /**
     * 更新
     * @param user
     */
    void update(User user);

    /**
     * 创建
     * @param user
     * @return
     */
    int create(User user);

    /**
     * 根据id删除
     * @param id
     */
    void delById(int id);

    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    List<User> findByUsername(String username);

    /**
     * 检查登录
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username,String password);
}
