package com.xiaoluomo.annotation_dao;

import java.util.List;

public interface UserDao {
    public int addUser(User user);
    public int updateUser(User user);
    public int deleteUser(int id);

    public User findUser(int id);
    public List<User> findUsers();

    //事物例子
    public void affair(User user);



}
