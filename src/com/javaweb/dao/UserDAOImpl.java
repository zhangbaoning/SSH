package com.javaweb.dao;

import com.javaweb.po.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by 张宝宁 on 2016/6/8.
 */
public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
    @Override
    public void saver(User user) {
        this.getHibernateTemplate().save(user);
    }

    @Override
    public void delete(int id) {
        this.getHibernateTemplate().delete(this.getHibernateTemplate().get(User.class, id));
    }


    @Override
    public void updata(User user) {
        this.getHibernateTemplate().saveOrUpdate(user);
    }

    @Override
    public List queryAll() {
        return (this.getHibernateTemplate().find("from User "));
    }

    @Override
    public User queryByID(int id) {
        return (User) (this.getHibernateTemplate().get(User.class, id));
    }
}
