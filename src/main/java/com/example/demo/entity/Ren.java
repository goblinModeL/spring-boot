package com.example.demo.entity;

import java.io.Serializable;

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

