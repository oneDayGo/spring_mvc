package com.xiaoluomo.other;

import java.util.List;

/**
 * @desc 可以构造函数注入,也可以属性注入
 * */
public class User {
    private String userName;
    private String password;
    private List<String> list;

    public User(){
        super();
    }

    //构造函数注入
    public User(String userName,String password,List<String> list){
        this.list = list;
        this.password = password;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", list=" + list +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

}
