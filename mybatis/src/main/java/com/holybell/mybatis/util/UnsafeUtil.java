package com.holybell.mybatis.util;

import com.holybell.mybatis.model.Blog;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnsafeUtil {

    private static Unsafe UNSAFE;

    public static Unsafe getUnSafe() throws NoSuchFieldException, IllegalAccessException {
        if (UNSAFE == null) {
            Field theUnSafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnSafe.setAccessible(true);
            UNSAFE = (Unsafe) theUnSafe.get(null);
        }
        return UNSAFE;
    }

    // 绕过构造器注解创建对象
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Blog blog = (Blog) getUnSafe().allocateInstance(Blog.class);
        System.out.println(blog);
    }
}
