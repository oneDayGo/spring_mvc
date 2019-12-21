package test;

import com.xiaoluomo.po.Course;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class CourseTest {

    SqlSession db;
    @Before
    public void init() throws Exception{
        String resource = "mybatis-config.xml";

        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
        db = build.openSession();
    }

    @Test
    public void findCourse(){
        List<Course> courses = db.selectList("com.xiaoluomo.mapper.courseMapper.findCourse");
        for (Course course:courses){
            System.out.println(course);
            System.out.println(course.getStudents());
        }
    }
}
