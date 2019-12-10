package com.iotek.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: 邪灵
 * @Date: 2019/12/5 21:37
 * @Description: Mybatis工具类
 * @Since: 1.0
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        String xml = "mybatis-config.xml";
        try {
            //使用mybatis的第一步：获取SqlSession对象
            InputStream inputStream = Resources.getResourceAsStream(xml);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    既然有了 SqlSessionFactory，顾名思义，我们就可以从中获得 SqlSession 的实例了。
    SqlSession 完全包含了面向数据库执行 SQL 命令所需的所有方法。
    你可以通过 SqlSession 实例来直接执行已映射的 SQL 语句。
     */
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
