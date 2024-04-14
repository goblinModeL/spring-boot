package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName problem
 */
@TableName(value ="problem")
public class Problem implements Serializable {
    /**
     * 问题id
     */
    @TableId(type = IdType.AUTO)
    private Integer mesid;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 
     */
    private String proTitle;

    /**
     * 内容
     */
    private String mes;

    /**
     * 提出时间
     */
    private Date starttime;

    /**
     * 审核状态
     */
    private Integer state;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 问题id
     */
    public Integer getMesid() {
        return mesid;
    }

    /**
     * 问题id
     */
    public void setMesid(Integer mesid) {
        this.mesid = mesid;
    }

    /**
     * 用户id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 用户id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 
     */
    public String getProTitle() {
        return proTitle;
    }

    /**
     * 
     */
    public void setProTitle(String proTitle) {
        this.proTitle = proTitle;
    }

    /**
     * 内容
     */
    public String getMes() {
        return mes;
    }

    /**
     * 内容
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * 提出时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 提出时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 审核状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 审核状态
     */
    public void setState(Integer state) {
        this.state = state;
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
        Problem other = (Problem) that;
        return (this.getMesid() == null ? other.getMesid() == null : this.getMesid().equals(other.getMesid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getProTitle() == null ? other.getProTitle() == null : this.getProTitle().equals(other.getProTitle()))
            && (this.getMes() == null ? other.getMes() == null : this.getMes().equals(other.getMes()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMesid() == null) ? 0 : getMesid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getProTitle() == null) ? 0 : getProTitle().hashCode());
        result = prime * result + ((getMes() == null) ? 0 : getMes().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mesid=").append(mesid);
        sb.append(", userid=").append(userid);
        sb.append(", proTitle=").append(proTitle);
        sb.append(", mes=").append(mes);
        sb.append(", starttime=").append(starttime);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


}