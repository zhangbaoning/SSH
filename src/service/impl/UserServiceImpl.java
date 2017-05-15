package service.impl;

import dao.UserDao;
import entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangbaoning on 2017/5/12.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    //创建dao接口的对象，为spring实现set方法
    @Resource(name = "userDao")
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional //配置事务信息
    public void saveUser(User user) {
        this.userDao.save(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        this.userDao.update(user);

    }

    @Override
    @Transactional
    public void deleteUser(User user) {
        this.userDao.delete(user);

    }

    @Override
    @Transactional
    public User findUserById(Integer id) {
        return this.userDao.findByid(id);
    }

    @Override
    @Transactional
    public List<User> findAllUser() {
        return this.userDao.findAll();
    }
}
