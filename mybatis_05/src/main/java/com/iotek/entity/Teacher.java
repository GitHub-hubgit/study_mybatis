package com.iotek.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: 邪灵
 * @Date: 2019/12/9 17:19
 * @Description: 老师类
 * @Since: 1.0
 */
@Data
public class Teacher implements Serializable {
    private Integer id;
    private String name;
}
