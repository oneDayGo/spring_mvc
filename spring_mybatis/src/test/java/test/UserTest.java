package test;

import com.xiaoluomo.dao.IUserDao;
import com.xiaoluomo.mapper.UserMapper;
import com.xiaoluomo.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    ApplicationContext context;
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testUser(){
        IUserDao userDao = context.getBean("userDao",IUserDao.class);
        User user = userDao.findUserById(9);
        System.out.println(user);
    }
    @Test
    public void testUserMapper(){
        UserMapper userMapper = context.getBean("userMapper",UserMapper.class);
        User user = userMapper.findUserById(10);
        System.out.println(user);
    }
}
