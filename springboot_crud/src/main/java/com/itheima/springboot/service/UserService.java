package com.itheima.springboot.service;

import com.itheima.springboot.dao.UserDao;
import com.itheima.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.selectAll();
    }

    public User findById(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

    public void save(User user) {
        userDao.insert(user);
    }

    public void delete(Integer id) {
        userDao.deleteByPrimaryKey(id);
    }

    public void update(User user) {
        userDao.updateByPrimaryKey(user);
    }
}
