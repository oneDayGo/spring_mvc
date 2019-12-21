package test;

import com.xiaoluomo.po.Identity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class IdentityTest {
    SqlSession db;

    @Before
    public void init() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        db = build.openSession();
    }

    @Test
    public void testIdentity(){
        List<Identity> lists = db.selectList("com.xiaoluomo.mapper.IdentityMapper.findIdentity");

        for (Identity identity:lists){
            System.out.println(identity);
            System.out.println(identity.getUser());
        }
    }

    @Test
    public void testIdentityOne(){
        Identity identity = db.selectOne("com.xiaoluomo.mapper.IdentityMapper.findOneIdentity",1);
        System.out.println(identity.toString());
        System.out.println(identity.getUser());
    }
}
