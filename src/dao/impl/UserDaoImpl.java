package dao.impl;

import dao.UserDao;
import entity.User;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangbaoning on 2017/5/12.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    //提供hibernate模板，并设置set方法用于spring
    @Resource(name = "hibernateTemplate")
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }


    @Override
    public void save(User user) {
        this.hibernateTemplate.save(user);
    }

    @Override
    public void update(User user) {
        this.hibernateTemplate.update(user);

    }

    @Override
    public void delete(User user) {
        this.hibernateTemplate.delete(user);

    }

    @Override
    public User findByid(Integer id) {
        return this.hibernateTemplate.get(User.class,id);
    }

    @Override
    public List<User> findAll() {
        //from实体类的名称
        return this.hibernateTemplate.find("from User");
    }
}
