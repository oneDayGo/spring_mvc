package com.xiaoluomo.service.impl;

import com.xiaoluomo.dao.UserDao;
import com.xiaoluomo.po.User;
import com.xiaoluomo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public List<User> findUserList(String keywords, Integer userListRoleId) {

        List<User> users = this.userDao.selectUserList(keywords, userListRoleId);

        return users;
    }

    public User findUser(String loginName, String password) {
        return this.userDao.findUser(loginName,password);
    }

    public User getUserByUserId(Integer userId) {
        return this.userDao.getUserByUserId(userId);
    }

    public User getUserByLoginName(String loginName) {
        return this.userDao.getUserByLoginName(loginName);
    }

    public int editUser(User user) {
        return this.userDao.updateUser(user);

    }

    public int addUser(User user) {
        return this.userDao.addUser(user);
    }

    public int delUser(Integer userId) {
        return this.userDao.delUser(userId);
    }

    public int setUserStatus(User user) {
        return this.userDao.setUserStatus(user);
    }
}
