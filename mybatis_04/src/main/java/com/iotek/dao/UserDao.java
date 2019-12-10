package com.iotek.dao;

import com.iotek.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: 邪灵
 * @Date: 2019/12/9 14:03
 * @Description:
 * @Since: 1.0
 */
public interface UserDao {
    @Select("select * from user")
    List<User> getUsers();
    @Insert("insert into user(name,pwd) values(#{name},#{pwd});")
    void addUser(User user);
    @Update("update user set name=#{name},pwd=#{pwd} where id=#{id};")
    void updateUser(User user);
    @Delete("delete from user where id=#{uid}")
    void deleteUser(@Param("uid") int id);
}
