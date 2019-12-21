package com.xiaoluomo.dao;

import com.xiaoluomo.po.User;
import org.apache.ibatis.annotations.Param;

public interface IUser {
    public User findUser(@Param("id") int id);
}
