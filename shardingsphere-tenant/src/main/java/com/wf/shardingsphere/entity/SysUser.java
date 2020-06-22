package com.wf.shardingsphere.entity;

import java.io.Serializable;

/**
 * 系统用户表(SysUser)实体类
 *
 * @author makejava
 * @since 2020-06-02 14:17:04
 */
public class SysUser implements Serializable {
    private static final long serialVersionUID = -46678611363212864L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 创建时间
    */
    private Object createTime;
    /**
    * 更新时间
    */
    private Object updateTime;
    /**
    * 创建人编码
    */
    private String createUser;
    /**
    * 修改人编码
    */
    private String updateUser;
    /**
    * 删除标记(1 删除 0未删除)
    */
    private Object deleteFlag;
    /**
    * 职位编码
    */
    private String posCode;
    /**
    * 启用标记(1 禁用 0启用)
    */
    private Object disableFlag;
    /**
    * 头像地址
    */
    private String avatar;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 密码
    */
    private String password;
    /**
    * 用户名
    */
    private String userName;
    /**
    * 真实姓名
    */
    private String realName;
    /**
    * 部门编码
    */
    private String deptCode;
    /**
    * 手机号
    */
    private String userPhone;
    /**
    * 租户
    */
    private String tenant;


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

    public Object getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Object updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Object getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Object deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getPosCode() {
        return posCode;
    }

    public void setPosCode(String posCode) {
        this.posCode = posCode;
    }

    public Object getDisableFlag() {
        return disableFlag;
    }

    public void setDisableFlag(Object disableFlag) {
        this.disableFlag = disableFlag;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

}