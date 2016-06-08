package com.javaweb.service;

import com.javaweb.po.User;

import java.util.List;

/**
 * Created by 张宝宁 on 2016/6/8.
 */
public interface UserService {
    public boolean addUser(User user);

    public boolean deleteUser(int id);

    public boolean updataUser(User user);

    public List queryAllUser();

    public User queryByID(int id);
}
