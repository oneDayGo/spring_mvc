package com.xiaoluomo.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    public void save() {
        System.out.println("userDao save");
    }
}
