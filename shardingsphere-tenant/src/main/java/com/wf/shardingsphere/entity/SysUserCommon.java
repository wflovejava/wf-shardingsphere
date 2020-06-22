package com.wf.shardingsphere.entity;

import java.io.Serializable;

/**
 * 系统用户表(SysUserCommon)实体类
 *
 * @author makejava
 * @since 2020-06-02 15:27:49
 */
public class SysUserCommon implements Serializable {
    private static final long serialVersionUID = 833260952774877977L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 创建时间
    */
    private Object createTime;
    /**
    * 创建人编码
    */
    private String createUser;
    /**
    * 用户名
    */
    private String userName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Object getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Object createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}