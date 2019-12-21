package com.xiaoluomo.dao;

import com.xiaoluomo.po.User;

public interface IUserDao {
    public User findUserById(Integer id);
}
