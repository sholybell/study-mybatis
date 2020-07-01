package com.holybell.mybatis.mapper;

import com.holybell.mybatis.model.Blog;
import org.apache.ibatis.annotations.Param;

public interface BlogMapper {

    Blog selectBlog(@Param("id") int id);

    int updateById(@Param("id") int id, @Param("name") String name);
}
