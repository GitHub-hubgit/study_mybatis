package com.iotek.dao;

import com.iotek.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: 邪灵
 * @Date: 2019/12/9 18:28
 * @Description:
 * @Since: 1.0
 */
public interface TeacherDao {
    @Select("select * from teacher where id=#{id}")
    Teacher getTeacherById(@Param("id")int id);
}
