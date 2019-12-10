package com.iotek.dao;

import com.iotek.entity.User;

import java.util.List;

/**
 * @Author: 邪灵
 * @Date: 2019/12/5 22:00
 * @Description: userDao接口类
 * @Since: 1.0
 */
public interface IUserDao {
    //查询所有用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //添加一个用户
    void saveUser(User user);
    //修改数据
    void updateUser(User user);
    //删除数据
    void deleteUser(User user);
}
