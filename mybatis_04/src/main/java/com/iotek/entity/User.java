package com.iotek.entity;

/**
 * @Author: 邪灵
 * @Date: 2019/12/9 14:02
 * @Description:
 * @Since: 1.0
 */
public class User {
    private Integer id;
    private String name;
    private String pwd;

    public User() {
    }

    public User(String name, String pwd) {
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
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
