package test;

import com.xiaoluomo.dao.IUser;
import com.xiaoluomo.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class UserTest {
    SqlSession db;
    @Before
    public void init() throws Exception{
        String resource = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        db = build.openSession();


    }
    @Test
    public void testFindUser(){
        User user = db.selectOne("com.xiaoluomo.mapper.UserMapper.findUser",116);
        System.out.println(user);
    }

    @Test
    public void testLike(){
        List<User> users = db.selectList("com.xiaoluomo.mapper.UserMapper.findUserByName",'h');
        System.out.println(users.toString());
    }

    @Test
    public void testAddUser(){
        User user = new User();
        user.setName("李小白");
        user.setPass("1234567");

        int rows = db.insert("com.xiaoluomo.mapper.UserMapper.addUser",user);
        if(rows>0){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
        System.out.println(rows);
        //获取插入主键
        System.out.println(user.getId());
        //提交事务
        db.commit();

    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setPass("23456");
        user.setName("庆余年");
        user.setId(96);
        int rows = db.update("com.xiaoluomo.mapper.UserMapper.userUpdate",user);

        if(rows>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
        db.commit();
    }

    @Test
    public void testDelUser(){
        int rows = db.delete("com.xiaoluomo.mapper.UserMapper.userDel",117);
        if(rows>0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
        db.commit();

    }


    //一对多查询
    @Test
    public void testfindOneIdentity(){
        User user = db.selectOne("com.xiaoluomo.mapper.UserMapper.findRelationUserAndBooksData",10);

        System.out.println(user);
        System.out.println(user.getBooks());

    }


    @After
    public void close(){
        db.close();
    }
}
