package com.xiaoluomo.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public int addUser(User user) {
        String sql = "insert into user(name,pass) value (?,?)";
        Object[] obj = new Object[]{
                user.getName(),
                user.getPass()
        };
        int num = this.jdbcTemplate.update(sql,obj);
        return num;

    }

    public int updateUser(User user) {
        String sql = "update user set name=?,pass=? where id=?";
        Object[] obj = new Object[]{
                user.getName(),
                user.getPass(),
                user.getId()
        };
        int num = this.jdbcTemplate.update(sql,obj);
        return  num;
    }

    public int deleteUser(int id) {
        String sql = "delete from user where id=?";
        int num = this.jdbcTemplate.update(sql,id);
        return  num;
    }

    public User findUser(int id) {

        String sql = "select * from user where id=?";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        return  this.jdbcTemplate.queryForObject(sql,rowMapper,id);
    }

    public List<User> findUsers() {

        String sql = "select * from user";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        return this.jdbcTemplate.query(sql,rowMapper);
    }
    /** 事务例子*/
    public void affair(User user) {

        String sql = "insert into user(name,pass) value (?,?)";
        Object[] obj = new Object[]{
                user.getName(),
                user.getPass()
        };
        Object[] obj2 = new Object[]{"小丽2","66666"};
       this.jdbcTemplate.update(sql,obj);

       int i = 1/0;
       this.jdbcTemplate.update(sql,obj2);
    }
}
