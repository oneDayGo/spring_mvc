package test;

import com.xiaoluomo.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectTest {

    ApplicationContext context;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("beans.xml");
    }

    @Test
    public void testUserDao(){
        UserDao userDao = context.getBean("userDao",UserDao.class);
        userDao.addUser();

    }
}
