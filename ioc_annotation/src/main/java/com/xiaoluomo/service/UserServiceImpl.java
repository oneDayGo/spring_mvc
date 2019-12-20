package com.xiaoluomo.service;

import com.xiaoluomo.dao.UserDao;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    public void save() {
        this.userDao.save();
        System.out.println("执行userService.save()");

    }
}
