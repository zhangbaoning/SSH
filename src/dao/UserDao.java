package dao;

import entity.User;

import java.util.List;

/**
 * Created by zhangbaoning on 2017/5/12.
 */
public interface UserDao {
    void save(User user);
    void update(User user);
    void delete(User user);
    User findByid(Integer id);
    List<User> findAll();
}
