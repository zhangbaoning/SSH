package com.javaweb.service;

import com.javaweb.dao.UserDAO;
import com.javaweb.po.User;

import java.util.List;

/**
 * Created by 张宝宁 on 2016/6/8.
 */
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public boolean addUser(User user) {
        if (userDAO.queryByID(user.getId()) == null) {
            userDAO.saver(user);
        } else {
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteUser(int id) {
        if (userDAO.queryByID(id) != null) {
            userDAO.delete(id);
        } else {
            return false;
        }
        return true;
    }

    @Override
    public boolean updataUser(User user) {
        if (userDAO.queryByID(user.getId()) != null) {
            userDAO.updata(user);
        } else {
            return false;
        }
        return true;
    }

    @Override
    public List queryAllUser() {
        return userDAO.queryAll();
    }

    @Override
    public User queryByID(int id) {
        return userDAO.queryByID(id);
    }
}
