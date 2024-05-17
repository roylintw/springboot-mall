package org.roylin.springbootmall.service.impl;

import org.roylin.springbootmall.dao.UserDao;
import org.roylin.springbootmall.dto.UserRegisterRequest;
import org.roylin.springbootmall.model.User;
import org.roylin.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
