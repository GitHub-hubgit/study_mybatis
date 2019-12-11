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
    /**
     * @date  2019/12/10 23:37
     * @param map
     * @return java.util.List<com.iotek.entity.Blog>
     * @description 测试choose标签
     */
    List<Blog> queryBlogChoose(Map map);
}
