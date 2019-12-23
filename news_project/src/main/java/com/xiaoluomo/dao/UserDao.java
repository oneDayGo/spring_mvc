package com.xiaoluomo.dao;

import com.xiaoluomo.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    //查询所有用户
    public List<User> selectUserList(@Param("keywords") String keywords,
                                     @Param("userListRoleId") Integer userListRoleId);

    //通过账号和密码查询用户
    public User findUser(@Param("loginName") String loginName,@Param("password") String password);

    //通过用户id查询用户
    public User getUserByUserId(Integer userId);

    //判断用户是否存在
    public User getUserByLoginName(String loginName);

    //添加用户
    public int addUser(User user);

    //更新用户
    public int updateUser(User user);

    //删除用户
    public int delUser(Integer userId);

    //用户状态 1未开启,2以开启,3被禁用
    public int setUserStatus(User user);


}
