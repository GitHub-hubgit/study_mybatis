package com.iotek.dao;

import com.iotek.entity.Student;

import java.util.List;

/**
 * @Author: 邪灵
 * @Date: 2019/12/9 18:27
 * @Description:
 * @Since: 1.0
 */
public interface StudentDao {
    //查询所有的学生信息以及对应老师的信息
    List<Student> getStudents();

    List<Student> getStudent1();
}
