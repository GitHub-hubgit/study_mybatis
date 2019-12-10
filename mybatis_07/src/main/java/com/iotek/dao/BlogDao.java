package com.iotek.dao;

import com.iotek.entity.Blog;

import java.util.List;
import java.util.Map;

/**
 * @Author: 邪灵
 * @Date: 2019/12/10 11:00
 * @Description: 博客dao接口
 * @Since: 1.0
 */
public interface BlogDao {
    int updateBlog(Blog blog);
    int addBlog(Blog blog);
    List<Blog> queryBlogIf(Map map);
    List<Blog> queryBlogChoose(Map map);
}
