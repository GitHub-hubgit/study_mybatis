package com.iotek.utils;

import java.util.UUID;

/**
 * @Author: 邪灵
 * @Date: 2019/12/10 10:56
 * @Description: 生成随机id工具类
 * @Since: 1.0
 */
public class CreateIdUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
