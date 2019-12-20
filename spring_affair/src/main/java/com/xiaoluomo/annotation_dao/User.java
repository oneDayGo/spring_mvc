package com.xiaoluomo.annotation_dao;

public class User {
    private Integer id;
    private  String pass;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", pass='" + pass + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
