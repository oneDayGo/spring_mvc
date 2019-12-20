package test;


import com.xiaoluomo.controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotationTest {

    ApplicationContext context;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("beans.xml");

    }

    @Test
    public void testUser(){

        UserController user = context.getBean("userController",UserController.class);
        user.save();
    }
}
