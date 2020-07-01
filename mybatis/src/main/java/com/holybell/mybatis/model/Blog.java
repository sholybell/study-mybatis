package com.holybell.mybatis.model;

import java.util.Date;

public class Blog {

    private Integer id;
    private String name;
    private Date createDate;
    private Blog blog;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

//    public Blog(Integer id, String name) {
//        this.id = id;
//        this.name = name;
//    }
}
