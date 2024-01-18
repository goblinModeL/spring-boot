package com.example.demo.entity;

import java.io.Serializable;

/**
 * 
 * @TableName all_active
 */
public class AllActive implements Serializable {
    /**
     * 
     */
    private String active;

    /**
     * 
     */
    private String img;

    /**
     * 
     */
    private String content;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public String getActive() {
        return active;
    }

    /**
     * 
     */
    public void setActive(String active) {
        this.active = active;
    }

    /**
     * 
     */
    public String getImg() {
        return img;
    }

    /**
     * 
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 
     */
    public String getContent() {
        return content;
    }

    /**
     * 
     */
    public void setContent(String content) {
        this.content = content;
    }


}