package com.example.demo.entity;

import java.io.Serializable;
//Entity层，顾名思义就是实体层，放置一个个实体，及其相应的set、get方法。如果想要对数据库进行一些操作（比如说读取）的话，就要先写entity层。
/**
 * (Ren)实体类
 *
 * @author makejava
 * @since 2023-11-28 13:51:09
 */
public class Ren implements Serializable {
    private static final long serialVersionUID = 310288545920952658L;

    private String name;

    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}

