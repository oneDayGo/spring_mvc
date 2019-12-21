package test;

import com.xiaoluomo.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class UserDynamicTest {


    SqlSession db;

    @Before
    public void init() throws Exception {
        String resource = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        db = build.openSession();
    }

    @Test
    public void testUserLike() {
        User user = new User();
        user.setName("hello");
        user.setPass("12345");

        List<User> users = db.selectList("com.xiaoluomo.mapper.Dynamic.findUser", user);

        System.out.println(users.toString());
    }

    @Test
    public void testUserCondition() {
        User user = new User();
       // user.setName("hello");
        //user.setPass("12345");

        List<User> users = db.selectList("com.xiaoluomo.mapper.Dynamic.findUser3", user);

        System.out.println(users.toString());
    }

    @Test
    public void testUpdateUser(){
        User user = new User();
        user.setName("okc");

        user.setId(116);

        List<User> users = db.selectList("com.xiaoluomo.mapper.Dynamic.updateUser", user);

        System.out.println(users.toString());
    }
    @Test
    public void testFindUserIn(){
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(96);
        ids.add(116);
        List<User> users = db.selectList("com.xiaoluomo.mapper.Dynamic.findUserIn",ids);
        System.out.println(users.toString());
        //findUserLike
    }
    @Test
    public void testFindUserLike(){
        User user = new User();
        user.setName("李");
        List<User> users = db.selectList("com.xiaoluomo.mapper.Dynamic.findUserLike",user);
        System.out.println(users.toString());
        //findUserLike
    }


    @After
    public void close() {
        db.close();
    }
}
