package com.xiaoluomo.service;

import com.xiaoluomo.dao.UserDao;
import com.xiaoluomo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 * @Transactional 表示类中所有方法纳入事务管理
 * */


@Service(value = "userServices")
@Transactional
public class UserServiceImpl implements UserService {

    /**
     * 自动注入,因为已经加入了接口及隐射文件了
     * <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
     *         <property name="basePackage" value="com.xiaoluomo.dao"></property>
     * </bean>
     *
     * */

    @Autowired
    private UserDao userDao;

    public User findUserById(Integer id) {

        return this.userDao.findUserById(id);
    }
}
