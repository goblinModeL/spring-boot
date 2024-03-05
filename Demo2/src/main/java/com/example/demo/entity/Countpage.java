package com.example.demo.entity;

import java.io.Serializable;

/**
 * 
 * @TableName countpage
 */
public class Countpage implements Serializable {
    /**
     * 
     */
    private String router;

    /**
     * 
     */
    private Integer count;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public String getRouter() {
        return router;
    }

    /**
     * 
     */
    public void setRouter(String router) {
        this.router = router;
    }

    /**
     * 
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 
     */
    public void setCount(Integer count) {
        this.count = count;
    }


}