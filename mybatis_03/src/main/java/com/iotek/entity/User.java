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
    private String pass;

    public User() {
    }

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User").append(":[")
                .append("id=")
                .append(id)
                .append(",name=")
                .append(name)
                .append(",pass=")
                .append(pass)
                .append("]  ");
        return sb.toString();
    }
}
