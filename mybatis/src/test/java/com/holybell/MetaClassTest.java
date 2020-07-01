package com.holybell;

import com.holybell.meta.reflection.DefaultReflectorFactory;
import com.holybell.meta.reflection.MetaClass;
import com.holybell.meta.reflection.MetaObject;
import com.holybell.meta.reflection.SystemMetaObject;
import com.holybell.mybatis.model.Blog;

public class MetaClassTest {

    public static void main(String[] args) {
//        Blog blog = new Blog();
//        MetaObject metaObject = SystemMetaObject.forObject(blog);
//        metaObject.setValue("id",1);
//        System.out.println(blog.getId());
//        metaObject.setValue("createDate",new Date());
//        System.out.println(blog.getCreateDate());

        Blog out = new Blog();
        Blog in = new Blog();
        in.setId(1);
        in.setName("in");
        out.setBlog(in);

        MetaObject metaObject = SystemMetaObject.forObject(out);
        System.out.println(metaObject.getValue("blog.name"));

        // 获取反射类定义信息
        MetaClass metaClass = MetaClass.forClass(Blog.class, new DefaultReflectorFactory());
        Class<?> clazz = metaClass.getGetterType("id");
        System.out.println(clazz.getName());
    }
}
