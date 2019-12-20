package test;

import com.xiaoluomo.jdbc.User;
import com.xiaoluomo.jdbc.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTest {

    ApplicationContext context;

    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("beans.xml");
    }

    @Test
    public void testUserTable(){
        UserDao userDao = context.getBean("user",UserDao.class);
       //System.out.println(userDao.addUser(this.add()));
        //System.out.println(userDao.updateUser(this.update()));
       //System.out.println(userDao.deleteUser(97));
        //System.out.println(userDao.findUser(96));
        System.out.println(userDao.findUsers());



    }
    public  User add(){
        User user = new User();
        user.setName("李小花");
        user.setPass("123456");
        return user;

    }
    public User update(){

        User user = new User();
        user.setPass("45678");
        user.setName("李小花花");
        user.setId(97);
        return user;
    }
}
