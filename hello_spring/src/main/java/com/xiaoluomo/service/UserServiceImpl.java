package com.xiaoluomo.service;

import com.xiaoluomo.dao.UserDao;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void login() {

        this.userDao.login();

        System.out.println("userService login");
    }
}
