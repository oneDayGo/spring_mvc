package test;

import com.xiaoluomo.dao.UserDao;
import com.xiaoluomo.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {

    ApplicationContext context;
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Test
    public void testUserDao(){
        UserDao userDao = context.getBean("userDao",UserDao.class);
        userDao.login();
    }
    @Test
    public void testUserService(){
        UserService userService = context.getBean("userService",UserService.class);
        userService.login();
    }
}
