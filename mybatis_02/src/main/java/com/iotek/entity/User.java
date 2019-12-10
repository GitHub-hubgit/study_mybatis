package com.iotek.entity;

import java.io.Serializable;

/**
 * @Author: 邪灵
 * @Date: 2019/12/5 21:53
 * @Description: User实体类
 * @Since: 1.0
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private String pwd;

    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public User(Integer id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpwd() {
        return pwd;
    }

    public void setpwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User").append(":[")
                .append("id=")
                .append(id)
                .append(",name=")
                .append(name)
                .append(",pwd=")
                .append(pwd)
                .append("]  ");
        return sb.toString();
    }
}
