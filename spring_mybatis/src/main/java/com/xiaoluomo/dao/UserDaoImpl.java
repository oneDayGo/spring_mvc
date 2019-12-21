package com.xiaoluomo.dao;

import com.xiaoluomo.po.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

//继承数据源
public class UserDaoImpl extends SqlSessionDaoSupport implements IUserDao {
    public User findUserById(Integer id) {
        return this.getSqlSession().selectOne("com.xiaoluomo.po.UserMapper.findUserById",id);
    }
}
