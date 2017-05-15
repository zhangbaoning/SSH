package service;

import entity.User;

import java.util.List;

/**
 * Created by zhangbaoning on 2017/5/12.
 */
public interface UserService {
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    User findUserById(Integer id);
    List<User> findAllUser();
}
