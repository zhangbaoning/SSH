package com.javaweb.dao;

import com.javaweb.po.User;

import java.util.List;

/**
 * Created by 张宝宁 on 2016/6/7.
 */
public interface UserDAO {
    public void saver(User user);

    public void delete(int id);
    public void updata(User user);
    public List queryAll();
    public User queryByID(int id);
}
