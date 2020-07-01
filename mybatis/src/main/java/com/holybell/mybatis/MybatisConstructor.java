package com.holybell.mybatis;

import com.holybell.mybatis.model.Blog;

import java.lang.reflect.Constructor;

public class MybatisConstructor {
    public static void main(String[] args) {
        Class<Blog> blogClass = Blog.class;
        Object obj = null;
        Constructor<?>[] constructors = blogClass.getConstructors();
        for (int i = 0; i < constructors.length; i++) {
            Constructor<?> constructor = constructors[i];
            try {
                obj = constructor.newInstance(1,"test");
            } catch (Exception e) {

            }
        }
        System.out.println(obj);
    }
}
