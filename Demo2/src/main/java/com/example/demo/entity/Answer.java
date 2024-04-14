package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName answer
 */
@TableName(value ="answer")
public class Answer implements Serializable {
    /**
     * 回答id
     */
    @TableId
    private Integer anId;

    /**
     * 
     */
    private Integer mesid;

    /**
     * 回答内容
     */
    private String anMes;

    /**
     * 用户id
     */
    private Integer anUserid;

    /**
     * 
     */
    private Integer state;

    /**
     * 
     */
    private Date finishtime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 回答id
     */
    public Integer getAnId() {
        return anId;
    }

    /**
     * 回答id
     */
    public void setAnId(Integer anId) {
        this.anId = anId;
    }

    /**
     * 
     */
    public Integer getMesid() {
        return mesid;
    }

    /**
     * 
     */
    public void setMesid(Integer mesid) {
        this.mesid = mesid;
    }

    /**
     * 回答内容
     */
    public String getAnMes() {
        return anMes;
    }

    /**
     * 回答内容
     */
    public void setAnMes(String anMes) {
        this.anMes = anMes;
    }

    /**
     * 用户id
     */
    public Integer getAnUserid() {
        return anUserid;
    }

    /**
     * 用户id
     */
    public void setAnUserid(Integer anUserid) {
        this.anUserid = anUserid;
    }

    /**
     * 
     */
    public Integer getState() {
        return state;
    }

    /**
     * 
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 
     */
    public Date getFinishtime() {
        return finishtime;
    }

    /**
     * 
     */
    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Answer other = (Answer) that;
        return (this.getAnId() == null ? other.getAnId() == null : this.getAnId().equals(other.getAnId()))
            && (this.getMesid() == null ? other.getMesid() == null : this.getMesid().equals(other.getMesid()))
            && (this.getAnMes() == null ? other.getAnMes() == null : this.getAnMes().equals(other.getAnMes()))
            && (this.getAnUserid() == null ? other.getAnUserid() == null : this.getAnUserid().equals(other.getAnUserid()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getFinishtime() == null ? other.getFinishtime() == null : this.getFinishtime().equals(other.getFinishtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAnId() == null) ? 0 : getAnId().hashCode());
        result = prime * result + ((getMesid() == null) ? 0 : getMesid().hashCode());
        result = prime * result + ((getAnMes() == null) ? 0 : getAnMes().hashCode());
        result = prime * result + ((getAnUserid() == null) ? 0 : getAnUserid().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getFinishtime() == null) ? 0 : getFinishtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", anId=").append(anId);
        sb.append(", mesid=").append(mesid);
        sb.append(", anMes=").append(anMes);
        sb.append(", anUserid=").append(anUserid);
        sb.append(", state=").append(state);
        sb.append(", finishtime=").append(finishtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}