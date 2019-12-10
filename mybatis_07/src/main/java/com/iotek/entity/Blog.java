package com.iotek.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: 邪灵
 * @Date: 2019/12/10 10:52
 * @Description: 博客实体类
 * @Since: 1.0
 */
@Data
public class Blog implements Serializable {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}
