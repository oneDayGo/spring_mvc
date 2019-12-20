package test;

import com.xiaoluomo.other.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    ApplicationContext context;

    @Before
    public  void init(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testUser(){

        User user = context.getBean("user",User.class);
        System.out.println(user);

        User user2 = context.getBean("user2",User.class);
        System.out.println(user2);
    }
}
