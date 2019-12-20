package test;

import com.xiaoluomo.dao.User;
import com.xiaoluomo.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    ApplicationContext context;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("baens.xml");
    }

    @Test
    public void testUserAffair(){

        UserDao userDao = context.getBean("user",UserDao.class);
        User user = new User();
        user.setName("小丽");
        user.setPass("123456");
        userDao.affair(user);
    }

    @Test
    public void testAnnotationAffair(){
       ApplicationContext context = new ClassPathXmlApplicationContext("annotation_baens.xml");
        com.xiaoluomo.annotation_dao.UserDao userDao = context.getBean("user",com.xiaoluomo.annotation_dao.UserDao.class);
        com.xiaoluomo.annotation_dao.User user = new com.xiaoluomo.annotation_dao.User();
        user.setName("小丽");
        user.setPass("123456");
        userDao.affair(user);
    }
}
