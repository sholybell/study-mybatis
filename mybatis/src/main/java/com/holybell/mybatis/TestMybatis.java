package com.holybell.mybatis;

import com.holybell.mybatis.mapper.BlogMapper;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * 与 {@link TestMybatisXML} 的区别在于，本类无需配置文件mybatis-config.xml
 */
public class TestMybatis {

    public static void main(String[] args) {

        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

        try (SqlSession session = sqlSessionFactory.openSession()) {
//            Blog blog = (Blog) session.selectOne("com.holybell.mybatis.mapper.BlogMapper.selectBlog", 101);
            session.getConfiguration().addMapper(BlogMapper.class);
            BlogMapper blogMapper = session.getMapper(BlogMapper.class);
            blogMapper.selectBlog(1);
        }
    }

    /**
     * 获取数据源
     */
    private static DataSource getDataSource() {
        Properties properties = new Properties();
        properties.setProperty("driver", "com.mysql.jdbc.Driver");
        properties.setProperty("url", "jdbc:mysql://localhost:3306/study?characterEncoding=UTF8");
        properties.setProperty("username", "root");
        properties.setProperty("password", "123456");
        PooledDataSourceFactory pooledDataSourceFactory = new PooledDataSourceFactory();
        pooledDataSourceFactory.setProperties(properties);
        return pooledDataSourceFactory.getDataSource();
    }

    /**
     * 获取Mybatis的SessionFactory
     */
    private static SqlSessionFactory getSqlSessionFactory() {
        DataSource dataSource = getDataSource();
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
//        configuration.addMapper(BlogMapper.class);
        return new SqlSessionFactoryBuilder().build(configuration);
    }
}
