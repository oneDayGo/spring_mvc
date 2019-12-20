package test;

import com.xiaoluomo.annotation_dao.UserDao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAspectTest {

    ApplicationContext context;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("annotation_aop.xml");
    }

    @Test
    public void testUser(){

        UserDao userDao = context.getBean("userDao", UserDao.class);
        userDao.addUser();
    }
}
