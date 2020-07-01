package com.holybell.mybatis;

import com.holybell.mybatis.model.Blog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatisXML {

    public static void main(String[] args) throws IOException {
        String resource = "com/holybell/mybatis/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        try (SqlSession session = sqlSessionFactory.openSession()) {
            Blog blog = (Blog) session.selectOne("com.holybell.mybatis.mapper.BlogMapper.selectBlog", 101);
        }
    }
}
