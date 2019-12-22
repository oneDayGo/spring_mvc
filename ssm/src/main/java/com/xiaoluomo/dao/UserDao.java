package com.xiaoluomo.dao;

import com.xiaoluomo.po.User;

public interface UserDao {

    /**
     * @desc 根据id查询用户信息
     * */
    public User findUserById(Integer id);
}
