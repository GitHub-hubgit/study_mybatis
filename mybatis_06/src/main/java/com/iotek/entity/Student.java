package com.iotek.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 邪灵
 * @Date: 2019/12/9 17:01
 * @Description: 学生类
 * @Since: 1.0
 */
@Data
public class Student implements Serializable {
    private Integer id;
    private String name;
    private Integer tid;
}
